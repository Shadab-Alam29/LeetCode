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
    public int getDecimalValue(ListNode head) {
        String num = "" ; 
        if (head.next == null && head.val == 0 )return head.val ;
        
        ListNode temp = head ;
        while ( temp != null){
            num = num + temp.val;
            temp = temp.next;
        }
        return Integer.parseInt(num, 2);

    }
}