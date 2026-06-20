class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0 ;
        int n = word.length();
       if (Character.isUpperCase(word.charAt(0))){
        for (int i = 1 ; i < n ; i++ ){
                if (Character.isUpperCase(word.charAt(i)))c++; 
        }
        if ( c == n-1 || c == 0) return true ;
       }
       else {
        for (int i = 1 ; i < n ; i++ ){
                if (Character.isLowerCase(word.charAt(i)))c++; 
        }
        if ( c == n-1 ) return true ;
       }
       return false;
    }
}