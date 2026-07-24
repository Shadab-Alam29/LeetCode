class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] S = new int[256];
        int[] T = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (S[a] != T[b]) {
                return false;
            }
            S[a] = i + 1;
            T[b] = i + 1;
        }
        return true;
    }
}
