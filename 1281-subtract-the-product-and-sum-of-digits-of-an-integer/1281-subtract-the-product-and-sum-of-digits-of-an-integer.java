class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0 ;
        int pro = 1 ;
        while(n>0){
            int dig = n%10;
            sum +=dig;
            pro *=dig;
            n=n/10;
        }
        return pro-sum;
    }
}