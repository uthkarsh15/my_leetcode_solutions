import java.util.Arrays;
class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int arr[] = new int[n];
        for(int i=1; i<=n; i=i+2){
            arr[i-1] = nums[i];
            arr[i] = nums[i-1];
        }
        return arr;
    }
}