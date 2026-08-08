class Solution {
    public int sumOfUnique(int[] nums) {
        int freq[] = new int[101];
        for ( int i : nums){
            freq[i]++;
        }
        int sum = 0 ;
        for( int i : nums){
            if(freq[i] == 1){
                sum+=i;
            }
        }
        return sum;


    //    HashMap<Integer, Integer> map = new HashMap<>();
    //    for (int x : nums) {
    //     if (map.containsKey(x)) {
    //         map.put(x, map.get(x) + 1);
    //     } 
    //     else 
    //         map.put(x, 1);
    //     }
    //     int sum = 0 ;
    //     for (int i : map.keySet()) {
    //         if (map.get(i) == 1) {
    //             sum += i;
    //         }
    //     }
    //     return sum ;
    }
}