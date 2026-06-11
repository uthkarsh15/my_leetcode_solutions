import java.util.HashMap;
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left=0;
        int maxFreq = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int right=0; right<n; right++){
            char rightChar = s.charAt(right);
            freq.put(rightChar, freq.getOrDefault(rightChar,0)+1);
            maxFreq = Math.max(maxFreq, freq.get(rightChar));
            if((right-left+1)-maxFreq > k){
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar) == 0){
                    freq.remove(leftChar);
                }
                left++;
            }
        }
        return n-left;
    }
}