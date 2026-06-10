import java.util.HashMap;
class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        int low = 0;
        int result = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int high=0; high<n; high++){
            char c = s.charAt(high);
            map.put(c, map.getOrDefault(c,0)+1);
            while(map.size() > k){
                char leftChar = s.charAt(low);
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                low++;
            }
            if(map.size()==k){
                result = Math.max(result, high - low +1);
            }
        }
        return result;
    }
}