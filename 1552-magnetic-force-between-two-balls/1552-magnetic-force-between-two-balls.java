class Solution {
    int canPlaceBalls(int position[], int minDistance) {
        int count = 1;
        int lastPosition = position[0];
 
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= minDistance) {
                count++;
                lastPosition = position[i];
            }
        }
        return count;
    }

    public int maxDistance(int[] position, int m) {
        int ans = -1;

        Arrays.sort(position);

        int n = position.length;
        int start = 1;
        
        int end = position[n - 1];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = canPlaceBalls(position, mid);

            if (count >= m) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}