class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });
        int end = 0 ; 
        int n = 0;
        for ( int []a : intervals ){
            if ( a[1] > end ){
                n++;
                end = a[1];
            }
        }
        return n ;
    }
}