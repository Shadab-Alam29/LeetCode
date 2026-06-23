class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(max == nums[i]){
                return i;
            }
        }
        return -1;
    }
}