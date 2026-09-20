class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for ( int i = 0 ; i < n ; i++){
            HashSet<Integer> st1 = new HashSet<>();
            HashSet<Integer> st2 = new HashSet<>();
            for ( int j = 0 ; j <= i ; j++){
                st1.add(nums[j]);
            }
            for ( int k = i+1 ; k < n ; k++){
                st2.add(nums[k]);
            }
            ans[i] = st1.size() - st2.size() ;
        }
        return ans ;
    }
}