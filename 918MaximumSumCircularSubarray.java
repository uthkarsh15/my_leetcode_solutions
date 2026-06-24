class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int currMax = 0;
        int currMin = 0;

        for(int num : nums){
            totalSum += num;

            currMax = currMax > 0 ? currMax + num : num;
            if(currMax > maxSum) maxSum = currMax;

            currMin = currMin < 0 ? currMin + num : num;
            if(currMin < minSum) minSum = currMin;
        }
        return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
    }
}