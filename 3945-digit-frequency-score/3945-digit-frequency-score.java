class Solution {
    public int digitFrequencyScore(int n) {
        int total = 0 ; 
        HashMap<Integer,Integer> map = new HashMap<>();
        while ( n > 0){
            int d = n % 10 ; 
            if ( map.containsKey(d)){
                map.put(d,map.get(d)+1);
            }
            else {
                map.put(d,1);
            }
            n = n/10 ;
        }
        for ( int i : map.keySet()){
            total += i * map.get(i);
        }
        return total ;
    }
}