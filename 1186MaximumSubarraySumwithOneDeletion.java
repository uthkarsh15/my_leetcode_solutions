class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
        int v1;
        int result = arr[0];
        for(int i=1; i<n; i++){
            int prevNoDelete = noDelete;
            noDelete = Math.max(noDelete + arr[i], arr[i]);
            if(oneDelete==Integer.MIN_VALUE){
                v1 = prevNoDelete;
            }else{
                v1 = oneDelete + arr[i];
            }
            oneDelete = Math.max(v1, prevNoDelete);
            result = Math.max(result, Math.max(noDelete, oneDelete));
        }
        return result;
    }
}