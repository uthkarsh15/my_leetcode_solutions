class Solution {
    public String minWindow(String s, String t) {
        int nt = t.length();
        int ns = s.length();

        if(s==null || t==null || ns < nt){
            return "";
        }

        int tFreq[] = new int[128];
        int sFreq[] = new int[128];

        for(int i=0; i<nt; i++){
            tFreq[t.charAt(i)]++;
        }
        int required = 0;
        for(int count : tFreq){
            if(count > 0) required++;
        }

        int low = 0;
        int formed = 0;

        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for(int high=0; high<ns; high++){
            char c = s.charAt(high);
            sFreq[c]++;

            if(tFreq[c] > 0 && tFreq[c]==sFreq[c]){
                formed++;
            }

            while(formed == required){
                if(high-low+1 < minLen){
                    minLen = high-low+1;
                    minStart = low;
                }
                char leftChar = s.charAt(low);
                sFreq[leftChar]--;

                if(tFreq[leftChar] > 0 && sFreq[leftChar] < tFreq[leftChar]){
                    formed--;
                }
                low++;
            }
        }
        return minLen == Integer.MAX_VALUE? "": s.substring(minStart, minStart+minLen);
    }
}