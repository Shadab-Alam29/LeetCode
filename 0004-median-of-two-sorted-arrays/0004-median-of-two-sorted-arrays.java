class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // my method 

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for (int value:nums1)
        //     pq.add(value);
        // for (int value:nums2)
        //     pq.add(value);
        // int n = pq.size()-1;
        // if(n%2==0){
        //     int i =0;
        //     while(  i  != n/2){
        //         pq.poll();
        //         i++;
        //     }
        //     return pq.peek();
        // }
        // else{
        //     int i = 0 ;
        //     double sum  = 0 ;
        //     while(i!=n/2){
        //         pq.poll();
        //         i++;
        //     }
        //     sum = pq.peek();
        //     pq.poll();
        //     sum += pq.peek();
        //     return sum/2;
        //}

        ArrayList<Integer>arr = new ArrayList<>();
        int a = nums1.length;
        int b = nums2.length;
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (nums1[i] < nums2[j]) {
                arr.add(nums1[i]);
                k++;
                i++;
            } else {
                arr.add(nums2[j]) ;
                k++;
                j++;
            }
        }
         while (i < a) {
            arr.add(nums1[i]);
            k++;
            i++;
        }        
        while (j < b) {
             arr.add(nums2[j]) ;
             k++;
             j++;
        }
        int n = arr.size();
        if(n % 2 == 1){
            return arr.get(n/2);
        }else{
           int c =  arr.get(n/2);
           int d = arr.get(n/2 -1);
           return (c+d) / 2.0;
        }
    }
}