class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> check = new HashSet<>();
        for (char ch : s.toCharArray()){
        if (check.contains(ch)) {
        return ch;   
            }
         check.add(ch);
        }
        return 'a' ;
    }
}