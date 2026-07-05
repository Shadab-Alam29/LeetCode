class Solution {
    public int longestSubarray(int[] nums) {
        int maxm = 0;
        int n = nums.length;
        int idx = -1;
        int sum = 0;
        
        for(int i = 0; i <= n - 1; i++){
            if(nums[i] == 0)
            {
                int prev_ones = i - 1 - idx;
                idx = i;
                sum = prev_ones;
            }
            else sum = sum + nums[i];
            maxm = Math.max(maxm, sum);
        }     
        if(maxm == n) return maxm - 1;
        return maxm;

    // int max =0 ;
    // int start = 0;
    // int fr []= new int[2];
    // for(int e = 0 ; e < nums.length ; e++ ){
    //     int value = nums[e];
    //     fr[value]++;
        
    //     while(fr[0]>1){
    //         int sch = nums[start++];
    //         fr[sch]--;
    //     }
    // int size = e-start;
    // max = Math.max(max,size);
    // }
    // return max;
    }
}