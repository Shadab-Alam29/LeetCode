class Solution {
    public int countElements(int[] nums) {
        if ( nums.length < 3)return 0 ;
        Arrays.sort(nums);
        int i = 0 ;
        int j = nums.length;
        for ( i = 0 ; i < nums.length-1 ;i++){
            if ( nums[i] != nums[i+1])break;
        }
        for(j = nums.length-1 ; j > 0 ; j--){
            if ( nums[j] != nums[j-1])break;
        }
        return Math.max(0, j - i - 1);
    }
}