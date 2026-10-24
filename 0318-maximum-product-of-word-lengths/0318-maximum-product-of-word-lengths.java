class Solution {
    public int maxProduct(String[] words) {
        int ans = 0;
        int arr1[] = new int[26];
        for (int i = 0; i < words.length; i++) {
            Arrays.fill(arr1, 0);
            String s = words[i];
            for (char k : s.toCharArray()) {
                arr1[k - 'a'] = 1;
            }
            for (int j = i + 1; j < words.length; j++) {
                String h = words[j];
                int f = 0;
                for (char k : h.toCharArray()) {
                    if (arr1[k - 'a'] == 1) {
                        f = 1;
                        break;
                    }
                }
                if (f == 0) {
                    ans = Math.max(ans, s.length() * h.length());
                }
            }
        }
        return ans;
    }
}