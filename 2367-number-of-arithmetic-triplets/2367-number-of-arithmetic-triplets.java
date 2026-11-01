class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    int ans = 0 ;
    for ( int i : nums){
        if (set.contains(i+diff) && set.contains(i+(2*diff))){
            ans++;
        }
    }
    return ans ;
    }
}