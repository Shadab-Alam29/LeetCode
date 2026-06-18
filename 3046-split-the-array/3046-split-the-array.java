class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int ans[] = new int [101];
        for ( int i : nums){
            ans[i]++;
            if ( ans[i]>2)
                return false;
            }
            return true;
    }
}