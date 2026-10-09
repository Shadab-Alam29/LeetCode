class Solution {
    public int minInsertions(String s) {
        int n= s.length();
       int a=0, b= 0;
       for(int i=0; i<n;i++){
        if(s.charAt(i)=='(')++b;   
        else{
            if(i<n-1&& s.charAt(i+1)==')'){
                ++i;

            }
            else{
                ++a;
            }
            if(b==0){
                ++a;

            }
            else{
                --b;
            }
        }
       }
       a+=b<<1;
       return a;

    }
}