class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int i = 0 ;
        int j = nums.length -1 ;
        while (i<j){
            int min = nums[i++];
            int max = nums[j--];
            set.add(min+max) ;
        }
        return set.size();
    }
}