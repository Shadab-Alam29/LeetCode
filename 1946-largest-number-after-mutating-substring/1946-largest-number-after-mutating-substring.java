class Solution {
    public String maximumNumber(String num, int[] change) {
        char[] arr = num.toCharArray();
        boolean start = false ; 
        for ( int i = 0 ; i < arr.length ; i++){
            int digit = arr[i]-'0';
            if ( change[digit]>digit){
                    arr[i] = (char)(change[digit] +'0');
                    start = true;
            }
            else if (change[digit] == digit && start) {
                arr[i] = (char)(change[digit] + '0');
            }
            else if (change[digit] < digit && start) {
                break;
            }
        }
        return new String(arr);
    }
}