class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for ( int i : nums){
            set.add(i);
        }
        int c = 0 ;
        int ans [] = new int [set.size()];
        int j = 0 ;
        for ( int i : set ){
                ans[j++] = i ;
        }
        Arrays.sort(ans);
         for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 0) continue;
            for (j = i; j < ans.length; j++) {
                ans[j] = ans[j] - ans[i];
            } 
           c++;
        }
        return c ;
    }
}