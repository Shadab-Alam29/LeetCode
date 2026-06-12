class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int ans = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            freq[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(j) - 'A']);
            int len = j - i + 1;
            if (len - maxFreq <= k) {
                ans = Math.max(ans, len);
            } else {
                freq[s.charAt(i) - 'A']--;
                i++;
            }
        }
        return ans;
    }
}