class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = Integer.MAX_VALUE;
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            x = Math.min(x, num);
        }

        int y = Integer.MAX_VALUE;
        for (int num : map.keySet()) {
            if (num > x && map.get(num) != map.get(x)) {
                y = Math.min(y, num);
            }
        }
        if (y == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        return new int[]{x, y};
    }
}