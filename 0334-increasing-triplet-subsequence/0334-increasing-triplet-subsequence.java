class Solution {
    public boolean increasingTriplet(int[] nums) {
      int l1 = Integer.MAX_VALUE;
      int l2 = l1 ;
      for ( int i : nums){
        if ( i<= l1)l1= i;
        else if ( i <= l2) l2 = i;
        else return true ;
      }
      return false ;
    }
}