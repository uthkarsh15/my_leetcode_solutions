class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int count[] = new int[26];

        for(int i=0; i<n; i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<n; i++){
            if(count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

// HashMap
// class Solution {
//     public int firstUniqChar(String s) {
//         int n = s.length();
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<n; i++){
//             map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
//         }
//         for(int i=0; i<n; i++){
//             if(map.get(s.charAt(i))==1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }