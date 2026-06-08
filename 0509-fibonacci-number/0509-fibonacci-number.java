class Solution {
    public int fib(int n) {

    //    return f(n);

  //  int f( int n){
        if ( n<=1)return n;
        return fib(n-1)+fib(n-2);
    }
   // }
            
        // int a = 0 , b = 1 ;
        // for ( int i = 0 ; i<n ;i++){
        //     int c = a+b;
        //     a=b;
        //     b=c;
        // }
        // return a ;

        // if(n<=1){
        //     return n;
        // }
        // if(n==2){
        //     return 1;
        // }
        // return fib(n-2)+fib(n-1);
    //}
}
