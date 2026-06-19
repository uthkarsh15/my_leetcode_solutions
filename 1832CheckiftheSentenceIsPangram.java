class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int alpha[] = new int[26];
        for(int i=0; i<n; i++){
            alpha[sentence.charAt(i) - 'a']++;
        }
        for(int count : alpha){
            if(count < 1) return false;
        }
        return true;
    }
}