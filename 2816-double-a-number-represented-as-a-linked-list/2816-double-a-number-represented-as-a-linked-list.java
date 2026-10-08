/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head ;
        while (temp!= null){
            st.push(temp.val);
            temp = temp.next ;
        }
        int crr = 0 ;
        ListNode newHead = null;
        while( !st.empty()){
            int val = st.peek();
            st.pop();
            val = val*2+crr;
            crr = val/10;
            val = val%10;
            ListNode node = new ListNode(val);
            node.next = newHead;
            newHead = node;
        }
        if ( crr > 0 ){
            ListNode node = new ListNode(crr);
            node.next = newHead;
            newHead = node;
        }
        return newHead;
    }
}