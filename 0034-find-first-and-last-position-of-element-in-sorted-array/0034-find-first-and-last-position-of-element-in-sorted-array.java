class Solution {
    public int[] searchRange(int[] nums, int target) {
   /* int f =findFirst(nums,target) ;
    int l =findLast(nums,target) ;
    return new int[]{f,l};
       
    }
    int findFirst(int[]nums,int target){
        int start = 0;
        int last = nums.length-1;
        int mid;
        int ans=-1;
        while(start<=last){
            mid = start + (last-start)/2;
            if(nums[mid]==target){
                ans=mid;
                last = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return ans ;
    }
    int findLast(int[]nums,int target){
        int start = 0;
        int last = nums.length-1;
        int mid;
        int ans=-1;
        while(start<=last){
            mid = start + (last-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                last = mid-1;
            }
        }
        return ans ;*/
        int f=-1,l=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(f==-1)f=i;
                l=i;
            }
        }
        return new int[]{f,l};
    }
}
