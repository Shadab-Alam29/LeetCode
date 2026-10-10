
import java.util.*;

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int s = digit_sum(i);

            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int max = 0;
        for (int i : map.values()) {
            max = Math.max(i, max);
        }
        return max;
    }

    static int digit_sum(int num) {
        int value = 0;
        while (num > 0) {
            value += num % 10;
            num = num / 10;
        }
        return value;
    }
}