class Solution {
    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
        for (int x : nums) {
            if (map.get(x) == 0) {
                continue;
            }
            int y = 2 * x;
            if (map.getOrDefault(y, 0) == 0) {
                return false;
            }
            map.put(x, map.get(x) - 1);
            map.put(y, map.get(y) - 1);
        }

        return true;
    }
}