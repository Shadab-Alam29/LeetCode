class Solution {
    public String largestOddNumber(String num) {
        int last = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                last = i;
                break;
            }
        }
        if (last == -1) return "";
        String ans = "";
        for (int i = 0; i <= last; i++) {
            ans += num.charAt(i);
        }
        return ans;
    }
}