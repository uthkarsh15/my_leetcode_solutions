import java.util.Arrays;
public class threeSumClosest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int n = nums.length;
            Arrays.sort(nums);
            int maxDiff = Integer.MAX_VALUE;
            int closestSum = 0; 

            for(int i=0; i<n-2; i++){
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }
                int left=i+1;
                int right=n-1;

                while(left < right){
                    int sum = nums[i] + nums[left] + nums[right];
                    int diff = Math.abs(target - sum);
                    if(diff == 0){
                        return sum;
                    }
                    else if(diff < maxDiff){
                        maxDiff = diff;
                        closestSum = sum;
                    }
                    if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
            return closestSum;
        }
    }
}