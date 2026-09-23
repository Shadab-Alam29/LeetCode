class Solution {
    public double average(int[] salary) {
        int max = 0 ; 
        int min = Integer.MAX_VALUE;
        for ( int i : salary){
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        double sum = 0 ; 
        int j = 0 ;
        for ( int i : salary){
            if ( i != max && i != min ){
                sum += i ; 
                j++;
            }
        }
        return (double)sum/j;
    }
}