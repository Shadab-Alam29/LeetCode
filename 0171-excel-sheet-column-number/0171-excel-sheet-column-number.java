class Solution {
    public int titleToNumber(String c) {
        int count = 0 ;
        int p = 0;
        for (int i = c.length() - 1; i >= 0; i--) {
            count += (c.charAt(i)-'A'+ 1) * Math.pow(26, p);
            p++;
        }
        return count ;
    }
}