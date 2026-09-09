class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for( char i : s.toCharArray()){
           if (Character.isDigit(i)) {
                st.pop();
            } else {
                st.push(i);
            }
        }
        String ans = "" ;
        while (!st.isEmpty()) {
            ans = st.pop() + ans ;
        }
        return ans ;
    }
}