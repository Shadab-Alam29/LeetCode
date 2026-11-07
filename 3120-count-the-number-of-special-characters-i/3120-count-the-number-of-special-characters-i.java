class Solution {
    public int numberOfSpecialChars(String word) {
        int arr[] = new int[52];
        for ( char i : word.toCharArray()){
                if ( i <='z' && i >= 'a' ){
                    arr[i-'a']++;
                }
                else {
                    arr[i-'A'+ 26]++;
                }
        }
        int ans = 0 ;
        for( int i = 0 ; i < arr.length/2 ; i++){
            if ( arr[i] > 0 && arr[i+26] > 0 ){
                ans++;
            }
        }
        return ans ;
    }
}