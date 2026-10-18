class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int c = 0;
        int mark = 0;
        int check[] = new int[k + 1];
        Arrays.fill(check, 0);
        for (int i = nums.size() - 1; i >= 0; i--) {
            int num = nums.get(i);
            if (num >= 1 && num <= k && check[num] == 0) {
                mark++;
                check[num]++;
            }
            c++;
            if (mark == k) {
                return c;
            }
        }
        return c;
    }
}