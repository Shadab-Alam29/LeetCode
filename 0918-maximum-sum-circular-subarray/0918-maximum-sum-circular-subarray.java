class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum1 = maxSubArray(nums);
        int total = 0;
        for (int num: nums){
            total += num;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=-1*nums[i];
        }
        int minsum = maxSubArray(nums);
        int maxsum2 = total + minsum;
        
        if(maxsum2 == 0) return maxsum1;
        return Math.max(maxsum1,maxsum2);

    }

     public int maxSubArray(int[] nums) {
            // Kadan's Algo
        int sum =0;
        int max=Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            sum += nums[i];
            max= Math.max(max,sum);
            if(sum<0)sum=0;
        }
        return max;
     }
}
//     int max = Integer.MIN_VALUE;
//     int n = nums.length;
    
//     for(int i=0 ; i< nums.length ; i++){
//         int sum =0;
//     for(int j=i ; j< i+nums.length ; j++){
//         int in = j%n;
//         sum += nums[in];
//         max = Math.max(max,sum);
//             }
//         }
//     return max;
//     }
// }