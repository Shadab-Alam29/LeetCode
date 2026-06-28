class Solution {
    public boolean isPalindrome(ListNode head) {
 ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
            size++;
        }
        int first = 0;
        int last = size - 1;
        while (first < last) {
            if (list.get(first)!=(list.get(last))) {
                return false;
            }
            first++;
            last--;
        }
        return true;
        // ListNode slow=head, fast=head;
        // while(fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // ListNode prev=null;
        // while(slow!=null)
        // {
        //     ListNode tmp=slow.next;
        //     slow.next=prev;
        //     prev=slow;
        //     slow=tmp;
        // }
        // while(prev!=null)
        // {
        //     if(head.val!=prev.val) return false;
        //     head=head.next;
        //     prev=prev.next;
        // }
        // return true;
    }
}