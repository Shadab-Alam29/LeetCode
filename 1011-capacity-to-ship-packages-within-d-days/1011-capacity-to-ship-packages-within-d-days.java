class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        for ( int i : weights){
            sum = sum+i;
            max= Math.max(max,i);
        }
        int start = max;
        int end = sum ; 
        int mid = start + (end - start) / 2;
        while ( end >= start){
            mid = start + (end - start) / 2;
            if (weight_check(weights,mid)<=days){
                end = mid-1;
            }
            else {
                start = mid+1;
            }  
        }
        return start ;
        
    }
    int weight_check(int[] weights, int capacity){
        int days = 1;
        int load = 0;
        for (int w : weights) {
            if (load + w <= capacity) {
                load += w;
            } else {
                days++;
                load = w;
            }
        }

        return days;
    }
}