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
    public ListNode deleteDuplicates(ListNode head) {
    if ( head == null) return null ;
    if ( head.next == null ) return head ;

    ListNode temp = head;
    int value = temp.val;
    while ( temp!= null && temp.next != null){
        if ( value != temp.next.val){
            temp = temp.next;
            value = temp.val;
        }
        else {
            temp.next= temp.next.next;
        }
    }
    return head ;

    }
}