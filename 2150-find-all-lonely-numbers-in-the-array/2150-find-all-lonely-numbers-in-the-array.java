class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> map = new HashSet<>();
        for ( int i : nums){
            if ( set.contains(i)){
                map.add(i);
            }
            else {
                set.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i : set){
              if (!map.contains(i) && !set.contains(i - 1) && !set.contains(i + 1)) {
                ans.add(i);
              }
        }
        return ans ;
    }
}