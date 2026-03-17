class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n<=1)return intervals;

        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[] update= intervals[0];
        for(int i =1 ; i<n ; i++){
            if(update[1]>=intervals[i][0]){
                update[1] = Math.max(update[1], intervals[i][1]);
            }
            else{
                ans.add(update);
                update=intervals[i];
            }
        }    
    ans.add(update); 

        return ans.toArray(new int[ans.size()][]);
    }
}