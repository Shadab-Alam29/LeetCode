class Solution {
    public int firstUniqueEven(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int f = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] == nums[j]) {
                        f = 1;
                        break;
                    }
                }
                if (f == 0)
                    return nums[i];
            }
        }
        return -1;
    }
}