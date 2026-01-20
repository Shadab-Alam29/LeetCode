class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int [] arr={-1,-1};
        int start=0;
        int end=nums.length-1;
       for(int i = 0;i< nums.length; i++){
        if(target==nums[i]){
            arr[0]=i;
            break;      
            }
       }
        for(int j = arr[0] + 1 ; j< nums.length;j++){
            if(target == nums[j]){
                arr[1]=j;
            }
        }
       
       return arr;

    }
}