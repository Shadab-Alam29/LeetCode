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
    public ListNode removeNodes(ListNode head) {
    ArrayList<Integer> ans = new ArrayList<>();
       while (head != null) {
            ans.add(head.val);
            head = head.next;
        }
    ArrayList<Integer> res = new ArrayList<>();
    int max = Integer.MIN_VALUE;

    for (int i = ans.size() - 1; i >= 0; i--) {
            if (ans.get(i) >= max) {
                res.add(ans.get(i));
                max = ans.get(i);
            }
        }
    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;
    for ( int i = res.size()-1 ; i>=0 ; i-- ){
         temp.next = new ListNode(res.get(i));
            temp = temp.next;
        }
     return dummy.next;
    }
}