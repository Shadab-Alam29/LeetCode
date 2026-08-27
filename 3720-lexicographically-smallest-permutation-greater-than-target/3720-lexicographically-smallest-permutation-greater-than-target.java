import java.util.*;

class Solution {
    public String lexGreaterPermutation(String s, String target) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            int[] freq = new int[26];
            for (char c : arr) {
                freq[c - 'a']++;
            }
            boolean possible = true;
            for (int j = 0; j < i; j++) {
                char c = target.charAt(j);
                if (freq[c - 'a'] == 0) {
                    possible = false;
                    break;
                }
                freq[c - 'a']--;
            }
            if (!possible) {
                continue;
            }
            char current = target.charAt(i);
            for (char c = (char) (current + 1); c <= 'z'; c++) {
                if (freq[c - 'a'] > 0) {
                    StringBuilder ans = new StringBuilder();
                    ans.append(target, 0, i);
                    ans.append(c);
                    freq[c - 'a']--;
                    for (int j = 0; j < 26; j++) {
                        while (freq[j] > 0) {
                            ans.append((char) ('a' + j));
                            freq[j]--;
                        }
                    }
                    return ans.toString();
                }
            }
        }
        return "";
    }
}