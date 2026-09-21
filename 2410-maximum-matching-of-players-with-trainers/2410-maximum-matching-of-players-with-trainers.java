class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        Arrays.sort(p);
        Arrays.sort(t);
        int i = p.length-1 ;
        int j = t.length-1 ;
        int count = 0 ;
        while ( i >= 0  && j >= 0 ){
            if ( p[i] <= t[j]){
                i--;
                j--;
                count++;
            }
            else {
                i--;
            }
        }
        return count ;
    }
}