class Solution {
    public int longestOnes(int[] nums, int k) {
    // int max =0 ;
    // int start = 0;
    // int fr []= new int[k+2];
    // for(int e = 0 ; e < nums.length ; e++ ){
    //     int value = nums[e];
    //     fr[value]++;
        
    //     while(fr[0]>k){
    //         int sch = nums[start++];
    //         fr[sch]--;
    //     }
    // int size = e-start+1;
    // max = Math.max(max,size);
    // }
    // return max;
   
    int max = Integer.MIN_VALUE;
    for ( int i = 0 ; i < nums.length ; i++){
        int ck = k ;
        int sum = 0;
        for ( int j = i ; j < nums.length ; j++){
            if (( nums[j] == 0 ) && (  ck > 0  )){
                sum ++;
                ck--;
            }
            else if( nums[j]== 1) sum++;
            else {
            break ;
            } 
        }
         max = Math.max(max,sum);
    }
    return max ;
    
    // int zero=0 , s=0 , max=0;
    //     for( int e=0 ; e<nums.length;e++){
    //     if(nums[e]==0) zero++;
    //         while(zero>k){
    //             if(nums[s]==0) zero--;
    //             s++;
    //         }
    //         int size=e-s+1;
    //         max=Math.max(max,size);
    //       }
    //       return max;

        }
    }
