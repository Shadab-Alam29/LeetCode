class Solution {
    public String makeGood(String s) {
        Stack<Character>st = new Stack<>();
        for( char ch : s.toCharArray()){
            if ( !st.isEmpty() && Character.toLowerCase(ch) == Character.toLowerCase(st.peek()) && ch != st.peek()){
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        String ans = "";
        while ( !st.isEmpty() ){
            ans = st.peek() +ans ;
            st.pop(); 
        }
        return ans ;
    }
}