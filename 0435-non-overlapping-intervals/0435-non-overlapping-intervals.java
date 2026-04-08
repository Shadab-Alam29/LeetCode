class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
          Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int ans = 1;
        int f= intervals[0][1]; 
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=f )
            {
                ans++;
                System.out.println(intervals[i][1]);
                f=intervals[i][1];
            }
        }
        return intervals.length-ans;
    }
}