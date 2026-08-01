class Solution {
    public int numFriendRequests(int[] ages) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int age : ages) {
            if (map.containsKey(age)) 
                map.put(age, map.get(age) + 1);
            else 
                map.put(age, 1);  
        }
        int ans = 0 ;
        for( int i :map.keySet() ){
           for (int j : map.keySet()){
            if ( j <= i * 0.5 +7) continue;
            if( j > i )continue ;
            if( j > 100 && i < 100)continue ;
            ans += map.get(i) * map.get(j);
            if ( i == j) ans -= map.get(i);
           } 
        }
        return ans ;
    }
}