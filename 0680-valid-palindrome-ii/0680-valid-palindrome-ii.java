class Solution {
    public boolean validPalindrome(String s) {
        int st = 0;
        int end = s.length() - 1;
        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return check(s, st + 1, end) || check(s, st, end - 1);
            }
            st++;
            end--;
        }
        return true;
    }
         boolean check(String s, int st, int end) {
           while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}