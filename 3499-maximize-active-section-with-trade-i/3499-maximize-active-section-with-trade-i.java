class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ans = 0;
        int pre = Integer.MIN_VALUE;
        int maxZero = 0;
        int i = 0;
        while (i < s.length()) {
            int j = i + 1;

            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            int cur = j - i;

            if (s.charAt(i) == '1') {
                ans += cur;
            } else {
                maxZero = Math.max(maxZero, pre + cur);
                pre = cur;
            }
            i = j;
        }
        return ans + maxZero;
    }
}