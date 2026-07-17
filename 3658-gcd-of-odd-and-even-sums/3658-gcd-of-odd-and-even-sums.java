class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = n*n; // oddsum
        int b = a+n; // evensum
         while ( b!=0){
                int temp = b ; 
                b = a % b ;
                a = temp ;
         }
         return a ;
    }
}