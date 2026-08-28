class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int ones = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    ones++;
                }
                if (ones == k) {
                    list.add(s.substring(i, j + 1));
                }
                if (ones > k) {
                    break;
                }
            }
        }
        if (list.isEmpty()) {
            return "";
        }
        Collections.sort(list, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });
        return list.get(0);
    }
}