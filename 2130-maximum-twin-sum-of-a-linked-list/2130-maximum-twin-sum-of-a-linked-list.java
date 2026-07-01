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
    public int pairSum(ListNode head) {
        ListNode newHead = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode newNode = new ListNode(curr.val);
            newNode.next = newHead;
            newHead = newNode;
            curr = curr.next;
        }
        int max = 0;
        ListNode a = head ;
        ListNode b = newHead ;
        while ( a != null){
            max = Math.max(max,a.val+b.val);
            a=a.next;
            b=b.next;
        }
        return  max;
    }
}