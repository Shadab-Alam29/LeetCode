class Solution {
    public int findMaxK(int[] nums) {
     Set<Integer> set = new HashSet<>();
      for (int i : nums) {
            set.add(i);
        }
        int ans = -1;
     for (int i : nums) {
            if (set.contains(-i)) {
                ans = Math.max(ans, i);
            }
        }
        return ans ;   
    }
}