class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int value:nums1)
            pq.add(value);
        for (int value:nums2)
            pq.add(value);
        int n = pq.size()-1;
        if(n%2==0){
            int i =0;
            while(  i  != n/2){
                pq.poll();
                i++;
            }
            return pq.peek();
        }
        else{
            int i = 0 ;
            double sum  = 0 ;
            while(i!=n/2){
                pq.poll();
                i++;
            }
            sum = pq.peek();
            pq.poll();
            sum += pq.peek();
            return sum/2;

        }
        
    }

}