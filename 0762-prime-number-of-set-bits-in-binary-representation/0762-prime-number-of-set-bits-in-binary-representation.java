class Solution {
  public int countPrimeSetBits(int left, int right) {
    final int m= 665772;
    int ans = 0;

    for (int num = left; num <= right; ++num)
      if ((m >> Integer.bitCount(num) & 1) == 1)
        ++ans;

    return ans;
  }
}