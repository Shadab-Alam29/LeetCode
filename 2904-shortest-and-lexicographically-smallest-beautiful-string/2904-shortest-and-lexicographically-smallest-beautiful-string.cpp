#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    string shortestBeautifulSubstring(string s, int k) {
        vector<string> check;
        int n = s.size();

        for (int i = 0; i < n; i++) {
            int one = 0;
            for (int j = i; j < n; j++) {
                if (s[j] == '1') {
                    one++;
                }
                if (one == k) {
                    check.push_back(s.substr(i, j - i + 1));
                    break;
                }
            }
        }

        if (check.empty()) {
            return "";
        }

        sort(check.begin(), check.end(), [](const string &a, const string &b) {
            if (a.length() != b.length()) {
                return a.length() < b.length();
            }
            return a < b;
        });

        return check[0];
    }
};