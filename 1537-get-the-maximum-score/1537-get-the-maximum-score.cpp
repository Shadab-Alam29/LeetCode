#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int maxSum(vector<int>& nums1, vector<int>& nums2) {
        int i = 0, j = 0;
        long long s1 = 0, s2 = 0;
        long long sum = 0;
         int MOD = 1e9 + 7;

        while (i < nums1.size() && j < nums2.size()) {
            if (nums1[i] < nums2[j]) {
                s1 += nums1[i];
                i++;
            }
            else if (nums2[j] < nums1[i]) {
                s2 += nums2[j];
                j++;
            }
            else {
                sum += max(s1, s2) + nums1[i];
                i++;
                j++;
                s1 = 0;
                s2 = 0;
            }
        }

        // remaining elements in nums1
        while (i < nums1.size()) {
            s1 += nums1[i++];
        }

        // remaining elements in nums2
        while (j < nums2.size()) {
            s2 += nums2[j++];
        }

        sum += max(s1, s2);

        return (int)(sum % MOD);
    }
};