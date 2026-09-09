class Solution {
public:
    int firstUniqueFreq(vector<int>& nums) {
        unordered_map<int, int> count;
        for (int x : nums) {
            if (count.find(x) != count.end()) {
                count[x]++;
            } else {
                count[x] = 1;
            }
        }
        unordered_map<int, int> freq;
        for (auto x : count) {
            if (freq.find(x.second) != freq.end()) {
                freq[x.second]++;
            } else {
                freq[x.second] = 1;
            }
        }

        for (int x : nums) {
            if (freq[count[x]] == 1) {
                return x;
            }
        }
        return -1;
    }
};