class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int f = 0;
        char a = ' ';
        char b = ' ';
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                f++;
                if (f == 1) {
                    a = s1.charAt(i);
                    b = s2.charAt(i);
                } 
                else if (f == 2) {
                    if (a != s2.charAt(i) || b != s1.charAt(i)) {
                        return false;
                    }
                } 
                else {
                    return false;
                }
            }
        }
        return f == 0 || f == 2;
    }
}