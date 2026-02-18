class Solution {
    public int longestOnes(int[] nums, int k) {
      int max =0 ;
    int start = 0;
    int fr []= new int[k+2];
    for(int e = 0 ; e < nums.length ; e++ ){
        int value = nums[e];
        fr[value]++;
        
        while(fr[0]>k){
            int sch = nums[start++];
            fr[sch]--;
        }
    int size = e-start+1;
    max = Math.max(max,size);
    }
    return max;  
    }
}