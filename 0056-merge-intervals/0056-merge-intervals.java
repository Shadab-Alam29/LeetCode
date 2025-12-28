class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        else{
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ans = new ArrayList<>();
        int [] i =intervals[0];
        ans.add(i);
        for(int [] res : intervals ){
                if(res[0]<=i[1]){
                    i[1]= Math.max(i[1],res[1]);
                }
                else{
                    i=res;
                    ans.add(i);
                }
            }
            return ans.toArray(int[][] ::new);
        }
    }
}