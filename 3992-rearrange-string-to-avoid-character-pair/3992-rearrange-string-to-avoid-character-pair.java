class Solution {
    public String rearrangeString(String s, char x, char y) {
        String xCount = "" ;
        String yCount = "" ;
        String rem = "" ;
        for ( int i = 0 ; i < s.length() ; i++ ){
            if ( s.charAt(i) == x ) xCount += x;
            else if ( s.charAt(i) == y ) yCount += y ;
            else rem += s.charAt(i) ;
        }
        return yCount + rem + xCount ;
    }
}