import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        int degree = 0;
        int minLen = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (!firstIndex.containsKey(nums[i])) {
                firstIndex.put(nums[i], i);
            }
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            if (freq.get(nums[i]) > degree) {
                degree = freq.get(nums[i]);
                minLen = i - firstIndex.get(nums[i]) + 1;
            } 
            else if (freq.get(nums[i]) == degree) {
                minLen = Math.min(minLen, i - firstIndex.get(nums[i]) + 1);
            }
        }

        return minLen;
    }
}