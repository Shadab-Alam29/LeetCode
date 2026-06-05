import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        if (s.isEmpty()) {
            return t.charAt(0);
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return tArr[i];
            }
        }

        return tArr[tArr.length - 1];
    }
}