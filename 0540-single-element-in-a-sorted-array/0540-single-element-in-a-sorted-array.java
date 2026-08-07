class Solution {
    public int singleNonDuplicate(int[] nums) {
        int f = 0;
        int l = nums.length - 1;
        int mid = 0;
        while (f < l) {
            mid = f + (l - f) / 2;
            if (mid % 2 == 1)
                mid--;
            if (nums[mid] == nums[mid + 1])
                f = mid + 2;
            else
                l = mid;
        }
        return nums[f];
    }
}