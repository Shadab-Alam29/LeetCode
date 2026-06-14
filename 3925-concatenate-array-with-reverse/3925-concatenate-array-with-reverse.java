class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length*2;
        int ans[] = new int [n];
        int l = n-1;
        for ( int i = 0 ;i < nums.length ; i++){
            ans [ i ] = nums[ i ];
            ans [ l-- ] = nums[ i ];
        }
        return ans ;
    }
}