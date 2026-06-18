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
    public ListNode middleNode(ListNode head) {
        List<ListNode> l = new ArrayList<>();
        ListNode  temp = head;
        while(temp!=null){
            l.add(temp);
            temp=temp.next;
        }
        int ans = l.size()/2;
        return l.get(ans);
    }
}





// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
// }