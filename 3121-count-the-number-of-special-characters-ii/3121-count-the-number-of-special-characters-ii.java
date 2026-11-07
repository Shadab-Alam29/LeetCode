class Solution {
    public int numberOfSpecialChars(String word) {
        int arr[] = new int[52];
        int c = 0;

        for (char i : word.toCharArray()) {
            if (i >= 'a' && i <= 'z') {
                int idx = i - 'a';

                if (arr[idx + 26] > 0) {
                    if (arr[idx] > 0) {
                        c--;
                    }
                    arr[idx] = -1;
                }
                else if (arr[idx] != -1) {
                    arr[idx]++;
                }
            }
            else if (i >= 'A' && i <= 'Z') {
                int idx = i - 'A';

                if (arr[idx + 26] == 0) {
                    if (arr[idx] > 0) {
                        c++;
                    }
                    arr[idx + 26]++;
                }
            }
        }

        return c;
    }
}