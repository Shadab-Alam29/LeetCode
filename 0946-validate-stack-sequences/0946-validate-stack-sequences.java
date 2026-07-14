class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int n = pushed.length;
        int j = 0;
        for(int i = 0 ; i < n ; i++){
          st.push(pushed[i]);{
            while(st.peek() != -1 && popped[j]==st.peek()){
                st.pop();
                j++;
            }
          }
        }
        return j==n;
    }
}