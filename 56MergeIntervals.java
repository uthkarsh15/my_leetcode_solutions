import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return new int [0][0];
        }
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<n; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];

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