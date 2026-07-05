class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;        
        for ( int i = 0 ;i<=n-k ; i++){
            int sum = 0 ;
            for ( int j = i ; j<i+k ; j++){
                sum = sum +nums[j];
            }
            max = Math.max(max,sum) ;
        }
        
        return (double) max / k;


        // Queue<Integer> q = new LinkedList<>();
        // int sum = 0;
        // int maxSum = Integer.MIN_VALUE;
        // for (int num : nums) {
        //     q.offer(num);
        //     sum = sum + num;
        //     if (q.size() > k) {
        //         sum -= q.poll();
        //     }
        //     if (q.size() == k) {
        //         maxSum = Math.max(maxSum, sum);
        //     }
        // }
        // return (double) maxSum / k;

    }
}