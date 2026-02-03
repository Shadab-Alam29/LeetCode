class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase() ;
      s=s.replaceAll("[^a-zA-Z0-9]", ""); 
      int left =s.length()-1;
      int right=0;
      while(right<left){
        if(s.charAt(right)!=s.charAt(left))
        return false;
        right++;
        left--;
      } 
        return true;
    }
}