class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int mid = arr[(n - 1) / 2];
        int left = 0;
        int right = n - 1;
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            if (Math.abs(arr[left] - mid) > Math.abs(arr[right] - mid)) {
                ans[i] = arr[left++];
            } else {
                ans[i] = arr[right--];
            }
        }
        return ans;
    }
}