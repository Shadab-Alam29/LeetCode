class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for( int i = left ; i<= right ; i++){
            int temp = i ; 
            int f = 0 ;
            while ( temp > 0 ){
                int d = temp % 10 ; 
                if ( d == 0 || i % d != 0){
                    f = 1 ;
                    break ;
                }
                temp = temp/10;
            }
        if ( f == 0){
                ans.add(i);
        }
        }
        return ans ;
    }
}