class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        for(int i : ans.keySet()){
            if(ans.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}