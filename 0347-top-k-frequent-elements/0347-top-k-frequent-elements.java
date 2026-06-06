import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[k];
        int idx = 0;

        while (idx < k) {

            int maxFreq = -1;
            int maxNum = 0;

            for (int num : map.keySet()) {
                if (map.get(num) > maxFreq) {
                    maxFreq = map.get(num);
                    maxNum = num;
                }
            }

            ans[idx++] = maxNum;
            map.put(maxNum, -1);
        }

        return ans;
    }
}