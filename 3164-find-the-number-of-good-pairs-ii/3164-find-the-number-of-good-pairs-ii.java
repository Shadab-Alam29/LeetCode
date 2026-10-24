import java.util.*;

class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    if (map.containsKey(j)) {
                        map.put(j, map.get(j) + 1);
                    } else {
                        map.put(j, 1);
                    }

                    if (j != i / j) {
                        if (map.containsKey(i / j)) {
                            map.put(i / j, map.get(i / j) + 1);
                        } else {
                            map.put(i / j, 1);
                        }
                    }
                }
            }
        }

        long ans = 0;

        for (int i : nums2) {
            ans += map.containsKey(i * k) ? map.get(i * k) : 0;
        }

        return ans;
    }
}