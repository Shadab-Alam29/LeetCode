class Solution {
    public void moveZeroes(int[] arr) {
        int j=0;
        int i=0;
        int n=arr.length;
        for(i=0;i<n;i++){
            if(arr[i]!=0&& arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
}
 /*      for (;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            
        }
    }
}*/