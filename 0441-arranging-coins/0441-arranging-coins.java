class Solution {
    public int arrangeCoins(int n) {
        int st = 0;
        int rem = n;

        for (int i = 1; i <= n; i++) {
            if (rem >= i) {
                st++;
                rem -= i;
            } else {
                break;
            }
        }

        return st;
    }
}