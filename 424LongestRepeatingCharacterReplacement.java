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


// optimized solution without using HashMap
class Solution2 {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left=0;
        int maxFreq = 0;
        int freq[] = new int[26];
        for(int right=0; right<n; right++){
            int rightCharIdx = s.charAt(right) - 'A';
            freq[rightCharIdx]++;
            maxFreq = Math.max(maxFreq, freq[rightCharIdx]);
            if((right-left+1)-maxFreq > k){
                int leftCharIdx = s.charAt(left) - 'A';
                freq[leftCharIdx]--;
                left++;
            }
        }
        return n-left;
    }
}