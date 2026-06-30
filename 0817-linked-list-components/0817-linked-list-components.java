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
    public int numComponents(ListNode head, int[] nums) {
         HashSet<Integer> set = new HashSet<>();
         for ( int i : nums ){
            set.add(i);
         }
         int ans = 0 ;
         ListNode temp = head ;
         while ( temp != null){
        if (set.contains(temp.val)&&(temp.next == null || !set.contains(temp.next.val))) {
                ans++;
            }
             temp = temp.next;
         } 
         return ans ;
    }
}