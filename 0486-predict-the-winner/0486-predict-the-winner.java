class Solution {
    public boolean predictTheWinner(int[] nums) {
        int j = nums.length-1;
        return fun(nums,0,j)>=0 ;
    }
    static int fun(int[]num , int i , int j){
        if(i>j)return 0 ;
        int takefirst = num[i] - fun(num,i+1,j);
        int takelast = num[j] - fun(num,i,j-1);

        return Math.max(takefirst,takelast) ;
    }
}