class Solution {
    public int lengthOfLastWord(String s) {
        int f = 0 ;
        int c = 0 ;
        for( int i = s.length()-1; i>=0 ; i--){
            if (s.charAt(i) == ' '){
                if ( f == 0 ) continue ;
                else break;
            }
            else {
                c++;
                f=1;
            }
        }
        return c ;
    // s = s.trim();
    // //String words[] =s.split(" ");
    // //return words[words.length-1].length();  

    // int len =s.lastIndexOf(" ")+1;
    // return s.length()-len;
    }
}