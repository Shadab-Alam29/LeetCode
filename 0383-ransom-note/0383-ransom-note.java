class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        int n = magazine.length(); 
        for (int i = 0; i < n; ++i) {
             freq[magazine.charAt(i) - 'a']++; 
        }
        for ( int i = 0 ; i< ransomNote.length(); i++ ){
            if ( freq[ransomNote.charAt(i) - 'a'] == 0) return false;
            else {
                 freq[ransomNote.charAt(i) - 'a']--;
            }
        }
        return true ;
    }
}