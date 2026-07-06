class Solution {
  public int pivotIndex(int[] nums) {
    int past = 0 ; 
    int sum = 0 ;
    for ( int i : nums){
        sum += i ;
    }
    
    for ( int i = 0 ; i < nums.length ; i++){
        if ( past == sum -(past + nums[i])){
            return i ;
        }
        else {
            past +=nums[i];
           
        }
    }

    return -1;
  }
}