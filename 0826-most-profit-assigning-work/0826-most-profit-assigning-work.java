class Solution {
    public int maxProfitAssignment(int[] a, int[] b, int[] w) {
        Arrays.sort(w);
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                temp = b[i];
                b[i] = b[j];
                b[j] = temp;
                    }
                }
            }
        int max = b[0] ;
        for( int i = 0 ; i < b.length ; i++){
            if ( max >= b[i]){
                b[i] = max ;
            }
            else max = b[i];
        }

        int ans = 0 ;
        for( int i = w.length-1 ; i >= 0 ; i-- ){
            int check = ans ;
            for( int j = a.length-1 ; j >=0 ; j--){
                if ( w[i]>=a[j]){
                     ans +=b[j];
                     break ;
                     }
            }
            if ( check == ans ) break ;
        }
        return ans ;
    }
}  