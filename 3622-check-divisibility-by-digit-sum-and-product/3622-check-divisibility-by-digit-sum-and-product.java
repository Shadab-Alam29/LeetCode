class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0 ; 
        int i = n ;
        int product = 1 ;
        while ( i > 0){
            sum += i%10;
            product *= i%10;
            i=i/10;

        }
        if (n % (sum + product) == 0) return true;
        return false ;
    }
}