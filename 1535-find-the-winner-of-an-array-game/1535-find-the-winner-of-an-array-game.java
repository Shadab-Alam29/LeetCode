class Solution {
    public int getWinner(int[] arr, int k) {
        if (k >= arr.length) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }

      int first = arr[0];
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];
                count = 1;
            } else {
                count++;
            }

            if (count == k) {
                return first;
            }
        
        }

        return first;
    }
}