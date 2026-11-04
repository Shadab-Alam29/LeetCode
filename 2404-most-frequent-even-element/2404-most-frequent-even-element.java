class Solution {
    public int mostFrequentEven(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int max = Integer.MIN_VALUE;
    for( int i : nums){
        if ( i % 2 == 0){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
            max = Math.max(max,map.get(i));
        }
    } 
    int ans = Integer.MAX_VALUE;
    for (int i : map.keySet()){
        if ( map.get(i) == max){
            ans = Math.min(ans,i);
        }
    }
    return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
