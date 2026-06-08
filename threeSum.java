import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 public class threeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            
            List<List<Integer>> result = new ArrayList<>();
            for(int i=0; i<n-2; i++){
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }
                int sum = -1*nums[i];
                int left = i+1;
                int right = n-1;
                while(left < right){
                    int s = nums[left] + nums[right];
                    if(sum == s){
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    
                        right--;
                        left++;

                        while(left < right && nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left < right && nums[right]==nums[right+1]){
                            right--;
                        }
                    }else if(s < sum){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
            return result;
        }
    }
}