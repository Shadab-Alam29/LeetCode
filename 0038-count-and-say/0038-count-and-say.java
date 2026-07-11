class Solution {
    public String countAndSay(int n) {
        String s = "1";
        while (n > 1) {
            s = count(s);
            n--;
        }

        return s;
    }
    String count(String s) {
        
        StringBuilder ans = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans.append(count);
                ans.append(s.charAt(i - 1));
                count = 1;
            }
        }

        return ans.toString();
    }
}