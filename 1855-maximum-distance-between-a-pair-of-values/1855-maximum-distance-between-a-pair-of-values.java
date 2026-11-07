class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int distance = 0;
        for (int i = 0; i < nums1.length; i++) {
            int j = BinarySearch(nums1[i], nums2, i, nums2.length - 1);
            if (j >= i) {
                distance = Math.max(distance, j - i);
            }
        }
        return distance;
    }

    static int BinarySearch(int t, int arr[], int s, int l) {
        int ans = -1;
        while (s <= l) {
            int mid = s + (l - s) / 2;

            if (arr[mid] >= t) {
                ans = mid;
                s = mid + 1;
            } else {
                l = mid - 1;
            }
        }

        return ans;
    }
}