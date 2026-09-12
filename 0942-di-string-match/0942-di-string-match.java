class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length() ;
        int arr[] = new int [n+1];
        int l = n ; 
        int d = 0 ;
        int i = 0 ;
        for ( char ch : s.toCharArray()){
           if (ch == 'I')arr[i++] = d++;
            else arr[i++] = l--;
        }
         arr[i] = l;
        return arr ;
    }
}