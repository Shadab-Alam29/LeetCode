class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=nums1.length-1;
        if (m==0){
            for (int i=0;i<nums1.length;i++){
                nums1[i]=nums2[i];
            }
        }
        m=m-1;
        n=n-1;
        while (n>=0 && m>=0){
            if(nums1[m]>nums2[n]){
                nums1[p--]=nums1[m--];
            }
            else{
                nums1[p--]=nums2[n--];
            }
        }
        for(;n>=0;n--){
            nums1[p--]=nums2[n];
            
        }
    }
}