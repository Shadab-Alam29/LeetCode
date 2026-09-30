class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.sort(buses);
        Arrays.sort(passengers);

        int b = 0, p = 0, c = 0;

        while (b < buses.length) {
            c = 0;

            while (p < passengers.length) {
                if (buses[b] >= passengers[p] && c != capacity) {
                    arr.add(passengers[p]);
                    p++;
                    c++;
                } else {
                    break;
                }
            }
            b++;
        }

        if (c < capacity) {
            int ans = buses[buses.length - 1];

            while (Arrays.binarySearch(passengers, ans) >= 0) {
                ans--;
            }

            return ans;
        }

        for (int i = arr.size() - 1; i > 0; i--) {
            if (arr.get(i) - 1 != arr.get(i - 1)) {
                return arr.get(i) - 1;
            }
        }

        return arr.get(0) - 1;
    }
}