class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int a = word1.length();
        int b = word2.length();
        int k = 0 ;
        for (int i = 0 ; i < Math.min(a,b);i++){
            ans=ans+word1.charAt(i)+word2.charAt(i);
            k++;
        }
        if(a>b){
            for(int i =k;k<a;k++){
                ans+=(char)word1.charAt(k);
            }
        }
        else{
            for(int i=k;k<b;k++){
                ans+=(char)word2.charAt(k);
            }
        }
        return ans ;
    
    }
}