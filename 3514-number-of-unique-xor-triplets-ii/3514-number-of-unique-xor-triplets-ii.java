class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] present = new boolean[2048];

        for (int num : nums) {
            present[num] = true;
        }

        boolean[] pairXor = new boolean[2048];

        for (int a = 0; a < 2048; a++) {
            if (!present[a]) continue;

            for (int b = 0; b < 2048; b++) {
                if (present[b]) {
                    pairXor[a ^ b] = true;
                }
            }
        }

        boolean[] answer = new boolean[2048];

        for (int pair = 0; pair < 2048; pair++) {
            if (!pairXor[pair]) continue;

            for (int num = 0; num < 2048; num++) {
                if (present[num]) {
                    answer[pair ^ num] = true;
                }
            }
        }

        int count = 0;

        for (boolean x : answer) {
            if (x) count++;
        }

        return count;
    }
}