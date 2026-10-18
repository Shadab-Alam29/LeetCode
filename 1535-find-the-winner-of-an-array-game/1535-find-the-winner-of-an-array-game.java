class Solution {
    public int getWinner(int[] arr, int k) {
        if (k >= arr.length) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int first = arr[0];
        int[] arr1 = new int[arr.length];
        int size = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                arr1[size++] = first;
                first = arr[i];
                map.put(first, 1);
            } else {
                arr1[size++] = arr[i];
                map.put(first, map.getOrDefault(first, 0) + 1);
            }

            if (map.get(first) == k) {
                return first;
            }
        }

        return first;
    }
}