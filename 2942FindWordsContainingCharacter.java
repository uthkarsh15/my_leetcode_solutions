import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> number = new ArrayList<>();

        for(int i=0; i<n; i++){
            String current = words[i];
            int m = current.length();
            for(int j=0; j<m; j++){
                if(x == current.charAt(j)){
                    number.add(i);
                    break;
                }
            }
        }
        return number;
    }
}