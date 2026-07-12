class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : hand) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int count =  groupSize;
        Arrays.sort(hand);  

        for ( int i : hand){

            if (map.get(i) == 0) continue;
        
        for ( int j = 0 ; j < count ; j++){
             if (!map.containsKey(i + j) || map.get(i + j) == 0)
                    return false;
            else  map.put(i+j, map.get(i+j) - 1);
    
            }
        }
        return true ;
    }
}