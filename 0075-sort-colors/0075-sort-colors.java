class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums, 0 , nums.length-1);
        
    }
    static void quicksort(int arr[] , int low , int heigh){
        if ( low >= heigh) return ; 
        if ( low < heigh){
            int mid = midpoint(arr, low , heigh );
            quicksort( arr , low , mid-1);
            quicksort( arr , mid+1 , heigh);
        }
    }
    static int midpoint( int arr[] , int low , int heigh){
        int pivot = arr[low];
        int i = low ; 
        int j = heigh ; 
        while ( i < j){
            while ( arr[i] <= pivot && i < heigh){
                i++;
            }
            while ( arr[j] > pivot && j > low){
                j-- ;
            }
            if ( i < j ) swap(arr , i , j); 
        }
        swap(arr, low , j);
        return j ;
    }
    static void swap ( int arr[] , int i , int j ){
        int temp = arr [i] ; 
        arr[i] = arr[j];
        arr[j] = temp ;
    }
}