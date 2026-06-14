import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        int sFreq[] = new int[26];
        int pFreq[] = new int[26];
        List<Integer> result = new ArrayList<>();

        if(sLen < pLen){
            return result;
        }
        for(int i=0; i<pLen; i++){
            sFreq[s.charAt(i) - 'a']++;
            pFreq[p.charAt(i) - 'a']++;
        }
        for(int i=pLen; i<sLen; i++){
            if(Arrays.equals(sFreq, pFreq)){
                result.add(i-pLen);
            }
            sFreq[s.charAt(i) - 'a']++;
            sFreq[s.charAt(i-pLen) - 'a']-- ;
        }
        if(Arrays.equals(sFreq, pFreq)){
                result.add(sLen - pLen);
        }
        return result;
    }
}