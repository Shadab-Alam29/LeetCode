class Solution {
    public int smallestAbsent(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0 ; 
        for (int i : nums){
            sum+=i;
            set.add(i);
        }
        int avg = (sum / nums.length ) + 1 ;
        if ( avg < 1) avg = 1 ;
        while(true){
            if ( set.contains(avg)) avg++;
            else return avg;
        }
    }
}