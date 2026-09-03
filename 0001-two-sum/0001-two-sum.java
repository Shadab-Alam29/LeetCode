class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
    int ans [] = new int[2];
    for(int i=0;i<nums.length;i++){
        int t=target-nums[i];
        if(m.containsKey(t)){
            ans[0]= m.get(t);
            ans[1]=i;
        }
        m.put(nums[i],i);
    }
    return ans;
    }
}

