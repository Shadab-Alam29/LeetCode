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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head ;
        List<Integer> l = new ArrayList<>();
        while ( temp != null){
            l.add(temp.val);
            temp=temp.next;
        }
        int n = l.size()-1;
        ListNode tem= head;
        while (tem != null){
            tem.val = l.get(n);
            tem=tem.next;
            n--;
        }
        return head ;
    }
}