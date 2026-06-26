class Solution {
public:
    long long findTheArrayConcVal(vector<int>& nums) {
        int n = nums.size();
        int st = 0;
        int en = n - 1;
        long long concat_val = 0;
        while (st <= en) {
            if (st == en) {
                concat_val += nums[st];
                break;
            }
            string a = to_string(nums[st]);
            string b = to_string(nums[en]);
            string result = a + b;
            long long total = stoll(result);
            concat_val += total;
            st++;
            en--;
        }
        return concat_val;  
    }
};