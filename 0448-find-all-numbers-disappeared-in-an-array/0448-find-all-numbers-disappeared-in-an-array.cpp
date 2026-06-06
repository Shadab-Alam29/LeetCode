class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> arr(nums.size(), 0);
        vector<int> numbers;

        for (int x : nums) {
            arr[x - 1]++;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (arr[i] == 0) {
                numbers.push_back(i + 1);
            }
        }

        return numbers;
    }
};