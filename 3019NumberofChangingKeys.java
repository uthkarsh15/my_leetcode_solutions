class Solution {
    public int countKeyChanges(String s) {
        int n = s.length();
        int count = 0;
        for(int i=1; i<n; i++){
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i-1))){
                count++;
            } 
        }
        return count;
    }
}