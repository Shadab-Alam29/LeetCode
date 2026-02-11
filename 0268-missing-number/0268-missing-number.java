class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length+1;
    boolean[] array = new boolean[n+1];
    for(int i : nums) array[i]=true;
    for(int i =0 ;i < array.length;i++){
    if(array[i]==false)return i;
    }
    return -1;
    // int n = nums.length;    
    // int sum = (n*(n+1))/2;
    // for(int i:nums){
    //     sum -=i ;
    // }
    // return sum;


    }
}