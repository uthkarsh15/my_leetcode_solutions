class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int bestEnding = a[0];
        int result = a[0];
        for(int i=1; i<size; i++){
            int v1 = bestEnding + a[i];
            int v2 = a[i];
            bestEnding = Math.min(v1, v2);
            result = Math.min(bestEnding, result);
        }
        return result;
    }
}