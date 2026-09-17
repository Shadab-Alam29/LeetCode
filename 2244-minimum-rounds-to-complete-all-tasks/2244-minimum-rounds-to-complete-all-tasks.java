class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i : tasks){
            if ( map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else map.put(i,1);
        } 
        int ans = 0 ; 
        for( int  i : map.values()){
            if ( i == 1 )return -1 ;
            ans += i/3;
              if (i % 3 != 0) {
                ans++;
            }
        }
        return ans ;
    }
}