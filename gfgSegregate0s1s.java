class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int left = 0;
        int right = n-1;
        
        while(left < right){
            if(arr[left] > arr[right]){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left] == 0){
                left++;
            } 
            else{
                right--;
            }
        }
    }
}
