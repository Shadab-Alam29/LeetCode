import java.math.BigInteger;
import java.util.*;

class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<BigInteger> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int ones = 0;

            for (int j = i; j < s.length(); j++) {

                if (s.charAt(j) == '1') {
                    ones++;
                }

                if (ones == k) {
                    String sub = s.substring(i, j + 1);
                    list.add(new BigInteger(sub));
                }

                if (ones > k) {
                    break;
                }
            }
        }

        if (list.isEmpty()) {
            return "";
        }

        Collections.sort(list);

        return list.get(0).toString();
    }
}