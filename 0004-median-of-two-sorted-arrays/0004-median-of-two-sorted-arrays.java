class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        return merge(nums1,nums2,m,n);   
    }
     static double merge( int larr[],int rarr[],int l,int r){
        int i=0,j=0,k=0;
        int q=l+r;
        int arr[]=new int [q];
        double x=0.0;
        while(i<l && j<r){
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i< l){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j< r){
            arr[k]=rarr[j];
            j++;
            k++;
        }
        if ((q)%2==0){
        x =((arr[((q)/2)-1]+arr[(q)/2]));
        x=x/2;
        }
        else{
             
             x= arr[(q)/2];
        }
        return x;
     }

}