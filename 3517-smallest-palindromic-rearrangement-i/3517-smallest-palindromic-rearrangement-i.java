class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n / 2; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                ans.append((char)(i + 'a'));
                freq[i]--;
            }
        }
        String left = ans.toString();
        if (n % 2 != 0) {
            ans.append(s.charAt(n / 2));
        }
        for (int i = left.length() - 1; i >= 0; i--) {
            ans.append(left.charAt(i));
        }
        return ans.toString();
    }
}