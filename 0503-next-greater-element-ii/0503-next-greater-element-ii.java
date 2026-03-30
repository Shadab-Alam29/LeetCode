class Solution {
     public int[] nextGreaterElements(int[] nums) {
        int max = nums[0];
         int i = 0;
          for(; i< nums.length-1;i++)
          { if(nums[i]<nums[i+1] )
          { nums[i] = nums[i+1];
           max = nums[i+1]% nums.length;
            }
             else nums[i] = -1 ;
              }
               for(;i<nums.length;i++)
               { nums[i]= max ;
                } 
                return nums;
                 }
                  }