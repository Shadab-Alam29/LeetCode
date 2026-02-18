class Solution {
    public int longestSubarray(int[] nums) {
    int max =0 ;
    int start = 0;
    int fr []= new int[2];
    for(int e = 0 ; e < nums.length ; e++ ){
        int value = nums[e];
        fr[value]++;
        
        while(fr[0]>1){
            int sch = nums[start++];
            fr[sch]--;
        }
    int size = e-start;
    max = Math.max(max,size);
    }
    return max;
    }
}