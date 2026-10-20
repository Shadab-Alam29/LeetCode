class Solution {
    public int absDifference(int[] nums, int k) {
        int kmax = 0 ; 
        int kmin = 0 ; 
        Arrays.sort(nums);
        for ( int i = 0 ; i < k ; i++){
            kmin += nums[i];
            kmax += nums[nums.length-i-1];
        }
        return (kmax - kmin) ;
    }
}