class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String s3 = String.valueOf(num3);
        s1 = "0000"+s1;
        s2 = "0000"+s2;
        s3 = "0000"+s3;
        String ans = "" ; 
        for( int i = -4 ; i < 0 ; i++ ){
            char x = (char) Math.min(s1.charAt(i+s1.length()),
                Math.min(s2.charAt(i+s2.length()), s3.charAt(i+s3.length())));
            ans += x;
        }
         return Integer.parseInt(ans);
    }
}