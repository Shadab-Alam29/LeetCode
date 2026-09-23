class Solution {
    public int countLargestGroup(int n) {
      if( n < 10) return n ;
      HashMap<Integer,Integer> map = new HashMap<>();
      for ( int i = 1 ; i <= n ; i++){
        int x = i ;
        int sum = 0 ; 
        while ( x > 0){
            sum+=x%10;
            x = x/10;
            } 
        if (map.containsKey(sum))
            map.put(sum, map.get(sum)+1);
        else
             map.put(sum, 1) ;
      }
      int ans = 0 ; 
      int max = 0 ;
      for ( int i : map.values()){
        if ( max < i){
            max = i ;
            ans = 1;
        }
        else if ( i == max) ans++;
      }
      return ans ;
    }
}