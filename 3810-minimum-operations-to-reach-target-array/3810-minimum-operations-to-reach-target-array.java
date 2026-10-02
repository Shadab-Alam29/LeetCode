class Solution {
    public int minOperations(int[] nums, int[] target) {
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target[i]) {
                c++;
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                } else {
                    map.put(nums[i], 1);
                }

            }
        }
        int total = 0;
        for (int i : map.values()) {
            total += i - 1;
        }
        return c - total;
    }
}