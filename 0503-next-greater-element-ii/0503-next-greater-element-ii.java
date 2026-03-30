class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        Arrays.fill(ans,-1);
        /*for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int idx = (i+j)%nums.length;
                if(nums[idx]>nums[i]){
                    ans[i]=nums[idx];
                    break;
                }
            }
        }*/
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<2*nums.length;i++){
            int idx = i%nums.length;
            while(!s.isEmpty() && nums[idx]>nums[s.peek()]){
                int in = s.pop();
                ans[in] = nums[idx];
            }
            s.push(idx);
        }
        return ans;
    }
}