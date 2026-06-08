import java.util.Collections;
import java.util.List;

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) return;
        
        int flag = 0;
        int n = nums.length;
        
        for (int j = n - 2; j >= 0; j--) {
            int target = -1;
            for (int i = n - 1; i > j; i--) {
                if (nums[i] > nums[j]) {
                    if (target == -1 || nums[i] < nums[target]) {
                        target = i;
                    }
                }
            }
            if (target != -1) {
                int temp = nums[target];
                nums[target] = nums[j];
                nums[j] = temp;
                reverse(nums, j + 1, n - 1);
                flag = 1;
                break;
            }
        }
        
        if (flag == 0) {
            reverse(nums, 0, n - 1);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}