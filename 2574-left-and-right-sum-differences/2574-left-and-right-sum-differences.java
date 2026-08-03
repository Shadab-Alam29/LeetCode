class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arrL[] = new int[nums.length];
        int arrR[] = new int[nums.length];
        arrL[0] = 0;
        for( int i = 1 ; i <nums.length ;i++){
            arrL[i] = arrL[i - 1] + nums[i - 1];
        }
        arrR[nums.length-1] = 0 ;
        for( int i = nums.length-2 ; i >=0 ; i--){
             arrR[i] = arrR[i + 1] + nums[i + 1];
        }

        for( int i = 0 ; i < nums.length; i++){
            nums[i] = Math.abs(arrL[i] - arrR[i]);
        }
        return nums;
        
        // int n = nums.length;
        // int[] ans = new int[n];
        // int sum = 0;
        // for (int num : nums) {
        //     sum += num;
        // }
        // int leftSum = 0;
        // for (int i = 0; i < n; i++) {
        //     sum -= nums[i];         
        //     ans[i] = Math.abs(leftSum - sum);
        //     leftSum += nums[i];
        // }

        // return ans;
    }
}