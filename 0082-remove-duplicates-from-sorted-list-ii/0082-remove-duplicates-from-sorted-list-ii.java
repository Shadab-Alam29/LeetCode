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
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int i = 0;
        while (i < list.size()) {
            if ((i == 0 || !list.get(i).equals(list.get(i - 1))) &&
                (i == list.size() - 1 || !list.get(i).equals(list.get(i + 1)))) {

                temp.next = new ListNode(list.get(i));
                temp = temp.next;
            }

            i++;
        }
        return dummy.next;
    }
}