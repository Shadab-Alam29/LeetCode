class Solution {
public:
    string shortestBeautifulSubstring(string s, int k) {
        vector<string> check;

        for (int i = 0; i < s.length(); i++) {
            int ones = 0;

            for (int j = i; j < s.length(); j++) {

                if (s[j] == '1') {
                    ones++;
                }

                if (ones == k) {
                    check.push_back(s.substr(i, j - i + 1));
                }

                if (ones > k) {
                    break;
                }
            }
        }

        if (check.empty()) {
            return "";
        }

        sort(check.begin(), check.end(), [](string a, string b) {
            if (a.length() != b.length()) {
                return a.length() < b.length();
            }

            return a < b;
        });

        return check[0];
    }
};