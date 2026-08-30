class Solution {
    public int minimumDeletions(int[] nums) {
       int min = Integer.MAX_VALUE;
       int i = 0 ; 
       int max = Integer.MIN_VALUE;
       int j = 0 ; 
       for ( int k = 0 ; k <nums.length ; k++){
        if ( nums[k] > max){
            max=nums[k];
            j = k;
        }
        if ( nums[k] < min){
            min = nums[k];
            i = k ;
        }
       }
       int n = nums.length;

        int a = Math.max(i, j) + 1;
        int b = n - Math.min(i, j);
        int c = Math.min(i, j) + 1 + n - Math.max(i, j);

        return Math.min(a, Math.min(b, c));

    }
}