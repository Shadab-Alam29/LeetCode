class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for ( int i = 0 ; i < nums.length ; i++){
            int c = nums[i];
            if ( c >= n-i && (i == 0 || nums[i - 1] < n - i)) return n-i ;
        }
        return -1 ;
    }
}