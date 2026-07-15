class Solution {
    public int findLucky(int[] arr) {
        int max = -1 ;
        HashMap<Integer, Integer> freq = new HashMap<>();
            for ( int i : arr){
                if ( i <= 500 && freq.containsKey(i))
                     freq.put(i, freq.get(i) + 1);
                else    freq.put(i, 1); 
            }

            for ( int key : freq.keySet()){
                 if (key == freq.get(key)) 
                     max = Math.max(max, key);
            }
        return max ;
    }
}