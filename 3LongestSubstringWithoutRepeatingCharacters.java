import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low=0;
        int result=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int high=0; high<n; high++){
            char c = s.charAt(high);
            if(map.containsKey(c)){
                low = Math.max(low, map.get(c)+1) ;
            }
            map.put(c, high);
            result = Math.max(result, high-low+1);
        }
        return result;
    }
}