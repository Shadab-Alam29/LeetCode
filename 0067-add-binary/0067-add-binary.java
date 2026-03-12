class Solution {
    public String addBinary(String a, String b) {
        int sum = 0;
        int carr =0;
        String ans = "";
        int i = a.length()-1 ;
        int j = b. length()-1 ; 
        while( i>=0 || j>=0 || carr >0 ){
            sum = carr;
           if ( i >= 0 ){
           sum = sum + a.charAt(i)-'0';
           i--;
           }
           if (j >= 0 ) {
            sum = sum + b.charAt(j)-'0';
            j--;
           }

            ans = sum%2 + ans ;
            carr = sum/2;
        }
    return ans;
    }
}