class Solution {
public:
    long long maximumTripletValue(vector<int>& nums) {
        long long ans = 0;
        long long maxi = nums[0];
        long long diff = 0;

        for (int k = 1; k < nums.size(); k++) {
            ans = max(ans, diff * nums[k]);
            diff = max(diff, maxi - nums[k]);
            maxi = max(maxi, (long long)nums[k]);
        }
        return ans;
    }
};