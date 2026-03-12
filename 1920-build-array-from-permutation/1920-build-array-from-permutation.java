class Solution {
    public int[] buildArray(int[] nums) {
        int [] arr = new int [nums.length] ;
        for(int i = 0 ; i <= nums.length-1 ; i++){
            int index = nums[i];
            arr[i]=nums[index];
        }
        return arr;
    }
}