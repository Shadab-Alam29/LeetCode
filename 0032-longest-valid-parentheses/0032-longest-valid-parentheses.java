class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0 ; 
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0 ; i < s.length() ; i++ ){
            char ch = s.charAt(i);
            if(ch == '(') stack.push(i);
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                   int length =  i-stack.peek();
                   ans = Math.max(length,ans);
                }
            
            }
        }
        return ans ;
    }
}


//     Stack<Character> st = new Stack<>();
//     int nums = 0 ;
//     int max = 0 ;
//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             char ch = s.charAt(i);
//             if (st.isEmpty()) {
//                 st.push(ch);
//             } 
//             else if (st.peek() == '(' && ch == ')')
//             {
//                st.pop();
//                 nums = nums + 2 ;
//                 max = Math.max(nums,max);
//             } 
//             else {
//                 st.push(ch);
//                 if(st.peek() == ')') {
//                     nums = 0 ;
//                 }
//             }
//         } 
//         return max;
//     }
// }