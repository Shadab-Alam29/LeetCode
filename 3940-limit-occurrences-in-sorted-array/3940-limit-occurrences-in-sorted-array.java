class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int [n];
        int j = 0 ; 
        int c = 0 ; 
        for ( int i = 0 ; i < n ; i++){
            if ( i == 0 || nums[i] != nums[i-1]) c = 0 ;
            if ( c < k){
                ans[j++] = nums[i];
                c++;
            }
        }
        return Arrays.copyOf(ans, j);
    }
}