class Solution {
    public int[] sortArray(int[] nums) {
        int start = 0 ; 
        int end = nums.length-1 ; 
        mergesort(nums, start , end ); 
        return nums ;
    }
    static void mergesort(int arr[], int start, int end){
        if ( start >= end )return ;
        int mid = start + (end - start) / 2;
        mergesort( arr , start , mid );
        mergesort( arr , mid+1 , end );
        merge( arr , start , mid , end );
    } 
    static void merge( int arr[] , int start , int mid , int end){
        int temp[] = new int[end - start + 1];
        int i = start ; 
        int j = mid + 1 ;
        int k = 0 ;
        while ( i <= mid && j <= end ){
            if ( arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }
        while ( i <= mid) {
            temp[k++] = arr[i++];
        }
        while ( j <= end ){
            temp[k++] = arr[j++];
        }
        for (int p = 0; p < temp.length; p++) {
            arr[start + p] = temp[p];
        }
    }
}