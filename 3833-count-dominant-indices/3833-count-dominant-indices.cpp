class Solution {
public:
    int dominantIndices(vector<int>& nums) {
        int c = 0;
        int ans = 0;
        int total = 0;
        int n = nums.size();

        for (int i : nums) {
            total += i;
        }

        for (int i = 0; i < nums.size() - 1; i++) {
            total = total - nums[i];

            int check = total / (n - i - 1);

            if (check < nums[i]) c++;
        }

        return c;
    }
};