class Solution {
    public boolean divideArray(int[] nums) {
        if (nums.length % 2 != 0) return false;
        int[] arr = new int[10001];
        for (int j : nums) {
            arr[j]++;
        }
        for (int j : arr) {
            if (j % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}