class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(nums[mid] == 2){
                if(nums[mid] != nums[high]){
                    int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                }
                high--;
            }
            else if(nums[mid] == 0){
                if(nums[low] != nums[mid]){
                    int temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                }
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
}