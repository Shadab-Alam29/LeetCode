class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int total = 0;
        int cdis = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];

            if (start < destination) {
                if (i >= start && i < destination)
                    cdis += distance[i];
            } else {
                if (i >= start || i < destination)
                    cdis += distance[i];
            }
        }
        return Math.min(cdis, total - cdis);
    }
}