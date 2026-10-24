class Solution {
public:
    int maxProduct(vector<string>& words) {
        int ans = 0;
        int arr1[26];

        for (int i = 0; i < words.size(); i++) {
            fill(arr1, arr1 + 26, 0);
            string s = words[i];

            for (char k : s) {
                arr1[k - 'a'] = 1;
            }

            for (int j = i + 1; j < words.size(); j++) {
                string h = words[j];
                int f = 0;

                for (char k : h) {
                    if (arr1[k - 'a'] == 1) {
                        f = 1;
                        break;
                    }
                }

                if (f == 0) {
                    ans = max(ans, (int)(s.length() * h.length()));
                }
            }
        }

        return ans;
    }
};