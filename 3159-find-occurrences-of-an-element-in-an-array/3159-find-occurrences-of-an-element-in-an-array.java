class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
         ArrayList<Integer> list = new ArrayList<>();
         int occ = 0 ;
         for ( int i = 0 ; i < nums.length ; i++){
            if ( nums[i] == x){
                list.add(i);
                occ++;
            }
         }
         int ans [] = new int [queries.length];
         Arrays.fill(ans,-1);
         for ( int i = 0 ; i < queries.length;i++){
            if (queries[i] <= occ) 
            ans[i] = list.get(queries[i] - 1);
         }
         return ans ;
    }
}