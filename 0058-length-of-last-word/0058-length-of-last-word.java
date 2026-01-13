class Solution {
    public int lengthOfLastWord(String s) {
      String words[] =s.split(" ");
      int len = words.length-1;
      return words[len].length();  
    }
}