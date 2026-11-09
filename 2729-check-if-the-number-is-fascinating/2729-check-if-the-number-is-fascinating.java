class Solution {
    public boolean isFascinating(int n) {
        int arr[] = new int[10];

        fun(arr, n);
        fun(arr, n * 2);
        fun(arr, n * 3);

        for (int i = 1; i <= 9; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }
        return true;
    }
    static void fun(int[] arr, int n) {
        while (n > 0) {
            int d = n % 10;
            arr[d]++;
            n = n / 10;
        }
    }
}