class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1 ; 
        long heigh = time[0];
        for( int i : time){
            if (heigh < i){
                heigh = i;
            }
        }
        heigh = (long) heigh * totalTrips;
        while(low < heigh){
            long mid = low + ( heigh-low )/2 ;
            long total = 0 ;
            for( int i : time){
                total += mid/i;
                if ( total >= totalTrips){
                    break ;
                }
            }
            if ( total >= totalTrips){
                    heigh = mid ;
            }
            else {
                low = mid+1 ;
            }
        }
        return low ;
    }
}