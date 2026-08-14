class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int start = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            while (freq[s.charAt(i) - 'a'] > 2) {
                freq[s.charAt(start) - 'a']--;
                start++;
            }
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }
}