class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int total = 0 ;
        for( int i = 0 ; i < seats.length ; i++){
            int d = Math.abs(seats[i]-students[i]);
            total +=d ;
        }
        return total ;
    }
}