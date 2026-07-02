class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String  a = str1+str2;
        String  b = str2+str1;
        String ans = "" ;
        if ( !a.equals(b)) return ans;
        int n1 = str1.length();
        int n2 = str2.length();
        int len = gcd(n1,n2);
        for (int i = 0; i < len ; i++) {
            ans += str1.charAt(i);
        }
        return ans ;
    }
    int gcd(int a, int b){
         while (b != 0) {
        int temp = a % b;
        a = b;
        b = temp;
    }
    return a;
    }
}