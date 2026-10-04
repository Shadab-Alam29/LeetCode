class Solution {
    public int maxDigitRange(int[] nums) {
      int mx = 0;

        for (int i = 0; i < nums.length; i++) {
            int st = help(nums[i]);
            mx = Math.max(mx, st);
        }

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int st = help(nums[i]);

            if (st == mx) {
                ans += nums[i];
            }
        } 
        return ans;
    }
    static int help(int n){
        int max = 0 ; 
         int min = Integer.MAX_VALUE;
        while ( n > 0){
            int d = n % 10 ;
            max = Math.max(max,d);
            min = Math.min(min,d);
            n = n/10;
        }
        return max-min;
    }
}