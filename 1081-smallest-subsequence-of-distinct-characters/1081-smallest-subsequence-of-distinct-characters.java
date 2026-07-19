class Solution {
    public String smallestSubsequence(String s) {

        int[] ind = new int[26];
        int[] check = new int[26];

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            ind[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (check[c - 'a'] == 1)
                continue;
            while (ans.length() > 0 && ans.charAt(ans.length() - 1) > c && ind[ans.charAt(ans.length() - 1) - 'a'] > i) {
                check[ans.charAt(ans.length() - 1) - 'a'] = 0;
                ans.deleteCharAt(ans.length() - 1);
            }
            ans.append(c);
            check[c - 'a'] = 1;
        }

        return ans.toString();
    }
}