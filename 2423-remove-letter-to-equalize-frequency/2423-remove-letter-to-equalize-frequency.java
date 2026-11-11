class Solution {
    public boolean equalFrequency(String word) {
        int arr[] = new int[26];

        for (char i : word.toCharArray()) {
            arr[i - 'a']++;
        }

        int counter = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                counter++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) continue;

            arr[i]--;
            int a = 0;
            int flag = 0;

            for (int j = 0; j < 26; j++) {
                if (arr[j] != 0) {
                    if (a == 0) {
                        a = arr[j];
                    } else if (arr[j] != a) {
                        flag = 1;
                        break;
                    }
                }
            }

            arr[i]++;

            if (flag == 0) return true;
        }

        return false;
    }
}