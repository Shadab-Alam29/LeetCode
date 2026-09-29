class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int ans = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < k) {
                k = k - list.get(i);
                list.set(i, 0);
            }
            else if (list.get(i) == k) {
                k = 0;
                list.set(i, 0);
                break;
            }
            else {
                list.set(i, list.get(i) - k);
                k = 0;
                break;
            }
        }
        for (int i : list) {
            if (i != 0)
                ans++;
        }
        return ans;
    }
}