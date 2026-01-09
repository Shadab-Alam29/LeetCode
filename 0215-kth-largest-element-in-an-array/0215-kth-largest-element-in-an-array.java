class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      /*
    Elements are ordered according to their natural ordering (e.g., ascending for integers)
    by default,  functioning as a Min-Heap (smallest element has the highest priority).
    This can be customized using a Comparator for a different order, such as a Max-Heap.
      */
      for (int val:nums){
        pq.add(val);
        if(pq.size()>k){
            pq.remove();
        }
      } 
      return pq.peek();  
    }
}