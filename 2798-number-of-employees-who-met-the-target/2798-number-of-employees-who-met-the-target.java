class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0 ; 
        for( int i : hours){
            if ( target <= i) ans++;
        }
        return ans ;
    }
}