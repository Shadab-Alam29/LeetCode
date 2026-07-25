class Solution {
    public int maxProduct(int n) {
        int max1 = 0 ; 
        int max2  = 0;
        while (n != 0){
            int check = n%10;
            if ( check > max1) {
                max2 = max1 ;
                max1= check ;
            }
            else if ( max2 < check ){
                max2 = check ;
            }
            n = n/10;
        }
        return max1* max2 ;
    }
}