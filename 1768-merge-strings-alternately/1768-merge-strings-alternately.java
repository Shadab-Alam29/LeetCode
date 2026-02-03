class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a =word1.length()-1;
        int b =word2.length()-1;
        String s ="";
        int k=0;
        for(int i =0;i<=Math.min(a,b);i++){
            s=s+word1.charAt(i)+word2.charAt(i);
            k++;
        }
        if(a>b){
            for(int i =k;k<=a;k++){
                s+=(char)word1.charAt(k);
            }
        }
        else{
            for(int i=k;k<=b;k++){
                s+=(char)word2.charAt(k);
            }
        }
        return s;
        
    }
}