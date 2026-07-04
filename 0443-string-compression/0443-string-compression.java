class Solution {
    public int compress(char[] chars) {
        int n = chars.length ;
        int count = 0 ;
        int i = 0;
        String s = "";
        while ( i < n){
            char ch = chars[i];
            count = 0 ;
            while ( i < n && chars[i] == ch){
                count ++;
                i++;
            }
            s = s + ch ;
            if ( count > 1 )
            s = s + String.valueOf(count);
        }
        int ans = s.length();

        for (int j = 0 ; j <=ans-1 ; j++){
            chars[j] = s.charAt(j);
        }
        return ans ;
    }
}