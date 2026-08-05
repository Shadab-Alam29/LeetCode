class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int p = 0;
        int q = 0;
        while (p < nums1.length && q < nums2.length) {
            if (nums1[p] == nums2[q]) 
                return nums1[p];
            else if (nums1[p] < nums2[q]) 
                p++;
            else if ( nums1[p] > nums2[q]) 
                q++;
        }
        return -1;
    }
}