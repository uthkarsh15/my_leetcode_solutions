class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        int res[] = new int[n];
        for(int idx=n-1; idx>=0; idx--){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if(leftSquare > rightSquare){
                res[idx] = leftSquare;
                left++;
            }else{
                res[idx] = rightSquare;
                right--;
            }
        }
        return res;
    }
}