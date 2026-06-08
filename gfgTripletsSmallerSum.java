import java.util.Arrays;

public class gfgTripletsSmallerSum {
    class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int result = 0;
        
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            
            while(left < right){
                int s = arr[i] + arr[left] + arr[right];
                if(s < sum){
                    result += (right-left);
                    left++;
                }else if(s >= sum){
                    right--;
                }
            }
        }
        return result;
    }
}
}
