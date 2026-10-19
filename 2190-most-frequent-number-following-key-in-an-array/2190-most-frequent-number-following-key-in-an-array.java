class Solution {
    public int mostFrequent(int[] nums, int key) {
        int arr[] = new int [1001];
        for ( int i = 0 ; i < nums.length-1 ;i++){
            if (nums[i] == key){
                arr[nums[i+1]]++;
            }
        }
        int max = 0 ;
        int maxind = 0 ; 
        for ( int i = 0 ; i < arr.length ;i++){
            if ( max < arr[i]){
                max = arr[i];
                maxind = i ;
            }
        }
        return maxind ;
    }
}