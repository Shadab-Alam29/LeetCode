class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
            nums[i] = gcd(nums[i], max);
        }
        Arrays.sort(nums);
        max = n - 1;
        int min = 0;
        long sum = 0;
        while (min<max) {
            sum += gcd(nums[min++], nums[max--]);
        }
        return sum;
    }
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}