class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int ans = piles[piles.length - 1];

        if (h == piles.length)
            return ans;

        int start = 1;
        int end = piles[piles.length - 1];

        while (start <= end) {
            int k = start + (end - start) / 2;

            long hrs = hours(piles, k);

            if (hrs > h) {
                start = k + 1;
            } else {
                ans = k;
                end = k - 1;
            }
        }

        return ans;
    }

    long hours(int[] piles, int k) {
        long sum = 0;

        for (int pile : piles) {
            sum += (pile + k - 1) / k; // ceil(pile/k)
        }

        return sum;
    }
}