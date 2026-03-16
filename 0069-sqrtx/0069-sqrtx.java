class Solution {
  public int mySqrt(long x) {

    if (x < 2) {
        return (int)x;
    }
    long ans = x/2;
    for (long i = 0; i <= x / 2; i++) {
        if (i * i == x) {
            ans = (int)i;
            break;
        }
        if (i * i > x) {
            ans= (int)(i - 1);
            break;
        }
    }
return (int)ans ;
  }
}