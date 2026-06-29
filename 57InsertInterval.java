import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0){
            return new int[][]{newInterval};
        }
        List<int[]> temp = new ArrayList<>();
        boolean inserted = false;
        for(int i=0; i<intervals.length; i++){
            int start = intervals[i][0];
            
            if(inserted == false && start >= newInterval[0]){
                temp.add(newInterval);
                inserted = true;
            }
            temp.add(intervals[i]);
        }
        if(!inserted){
            temp.add(newInterval);
        }
        
        List<int[]> res = new ArrayList<>();

        int start = temp.get(0)[0];
        int end = temp.get(0)[1];

        for(int i=1; i<temp.size(); i++){
            int s = temp.get(i)[0];
            int e = temp.get(i)[1];

            if(end >= s){
                end = Math.max(end, e);
                continue;
            }
            res.add(new int[]{start, end});
            start = s;
            end = e;
        }
        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][]);
    }
}