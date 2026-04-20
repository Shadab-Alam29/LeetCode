class Solution {
    public int fib(int n) {

        int a = 0 , b = 1 ;
        for ( int i = 0 ; i<n ;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return a ;


        // if(n<=1){
        //     return n;
        // }
        // if(n==2){
        //     return 1;
        // }
        // return fib(n-2)+fib(n-1);
    }
}