class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        ListNode second = head;
        ListNode temp = first;
        int c = 1;
        while (temp.next != null) {
            temp = temp.next;
            c++;
        }
        int total = c + ( k-1 );
        for (int i = 1; i < total -k +1 ; i++) {
            second = second.next;
        }
        int a = second.val;
        int b = first.val;
        first.val = a;
        second.val = b;

        return head;
    }
}