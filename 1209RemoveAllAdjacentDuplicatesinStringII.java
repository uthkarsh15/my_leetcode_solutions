import javafx.util.Pair;
import java.util.Stack;
class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair<Character, Integer>> st = new Stack<>();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(new Pair<>(c, 1));
                continue;
            }
            if(st.peek().getKey()!=c){
                st.push(new Pair<>(c, 1));
                continue;
            }
            if(st.peek().getValue() < (k-1)){
                Pair<Character, Integer> p = st.peek();
                st.pop();
                st.push(new Pair<>(p.getKey(), p.getValue()+1));
                continue;
            }
            st.pop();
        }
        // stack to string
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            Pair<Character, Integer> p = st.peek();
            st.pop();
            int count = p.getValue();
            while(count>0){
                res.append(p.getKey());
                count--;
            }
        }
        return res.reverse().toString();
    }
}