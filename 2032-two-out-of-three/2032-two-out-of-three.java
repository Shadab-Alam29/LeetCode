class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> answer = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }
        for (int x : nums2) {
            set2.add(x);
        }
        for (int x : nums3) {
            set3.add(x);
        }
        int[] freq = new int[101];
        for (int x : set1) {
            freq[x]++;
        }
        for (int x : set2) {
            freq[x]++;
        }
        for (int x : set3) {
            freq[x]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 2) {
                answer.add(i);
            }
        }
        return answer;
    }
}