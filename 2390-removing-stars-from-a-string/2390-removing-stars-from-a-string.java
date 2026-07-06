
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
          StringBuilder k = new StringBuilder();

        while (!st.isEmpty()) {
            k.append(st.pop());
        }

        return k.reverse().toString();
    }
}
//        String k = "" ;
//         while (!st.isEmpty()) {
//             k =  st.pop() + k;
//             }
//        return k ;      
//     }
   
// }