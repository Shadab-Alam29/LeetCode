class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for ( int i : nums ){
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        int[] ans = new int[Math.min(k, list.size())];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}