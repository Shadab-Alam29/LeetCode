class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList <Integer> List1 = new ArrayList<>();
        ArrayList <Integer> List2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for ( int i : nums1){
            List1.add(i);
        }
         for ( int i : nums2){
            List2.add(i);
        }
        for (int i : nums1) {
            if (!List2.contains(i) && !ans.get(0).contains(i))
                ans.get(0).add(i);
        }

        for (int i : nums2) {
            if (!List1.contains(i) && !ans.get(1).contains(i))
                ans.get(1).add(i);
        }
        return ans ;

    }
}