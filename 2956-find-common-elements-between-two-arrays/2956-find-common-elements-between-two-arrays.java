class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1) set1.add(i);
        for (int i : nums2) set2.add(i);
        int[] arr = {0, 0};

        for (int i = 0; i < nums1.length; i++) 
            if (set2.contains(nums1[i])) arr[0]++ ;  
        for (int i = 0; i < nums2.length; i++) 
            if (set1.contains(nums2[i])) arr[1]++ ;
        return arr ;
    }
}