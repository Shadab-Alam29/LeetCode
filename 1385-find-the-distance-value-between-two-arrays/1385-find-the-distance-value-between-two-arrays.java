class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for (int i : arr1) {
            int left = 0;
            int right = arr2.length - 1;
            int f = 0;
            while (right >= left) {
                int mid = left + (right - left) / 2;
                if (Math.abs(i - arr2[mid]) <= d) {
                    f = 1;
                    break;
                }
                if (arr2[mid] > i)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            if (f == 0)
                ans++;
        }
        return ans;
    }
}