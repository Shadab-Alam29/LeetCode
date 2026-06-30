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
    public ListNode oddEvenList(ListNode head) {

          ListNode ans = new ListNode(0);
          ListNode temp2 = ans ;
          ListNode temp = head ;
          if ( head == null )return head;
          while ( temp != null ){
            temp2.next = new ListNode(temp.val);
            temp2 = temp2.next;
             if (temp.next == null)break;
                 temp = temp.next.next;
          }
          temp = head.next ;
          while ( temp !=null){
            temp2.next = new ListNode(temp.val);
            temp2 = temp2.next;
             if (temp.next == null)break;
                 temp = temp.next.next;
          }
          
          return ans.next;
    }
}