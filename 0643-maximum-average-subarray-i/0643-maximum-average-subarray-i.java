class Solution {
    public double findMaxAverage(int[] nums, int k) {
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            q.offer(num);
            sum = sum + num;

            if (q.size() > k) {
                sum -= q.poll();
            }

            if (q.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return (double) maxSum / k;
    }
}