class Solution {
    public int pivotInteger(int n) {
      int total = n * (n + 1) / 2;
      int left = 0 ; 
      for ( int i = n ; i >=1 ; i--){
        left +=i;
        if (left == total - left + i) return i;
      }
      return -1 ;   
    }
}