class Solution {
    public int maxDifference(String s) {
        int freq [] = new int [26];
        for ( char i : s.toCharArray() ){
            freq[i-'a']++;
        }
        int maxodd = Integer.MIN_VALUE; 
        int mineven = Integer.MAX_VALUE;
        for ( int i =0 ; i < 26 ; i++){
            if ( freq[i] != 0){
                if ( freq[i]% 2 == 0){
                    mineven = Math.min( mineven , freq[i]);
                }
                else {
                    maxodd = Math.max( maxodd , freq[i]);
                }
            }
        }
        return maxodd-mineven;
    }
}