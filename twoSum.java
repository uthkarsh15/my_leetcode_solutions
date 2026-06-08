import java.util.HashMap;
public class twoSum {
    // bruute force solution
    class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    if(target == nums[i] + nums[j]){
                        return new int[] {i,j};
                    }
                }
            }
            return new int[] {-1,-1};
        }
    }

    // optimal solution using hash map
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<n; i++){
                int complement = target - nums[i];
                if(map.containsKey(complement)){
                    return new int[] {(map.get(complement)), i};
                }
                map.put(nums[i],i);
            }
            return new int[] {-1,-1};
        }
    }
}