class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        for ( int i = 0 ; i < digits.length ; i++){
            for ( int j = 0 ; j < digits.length ; j++){
                for ( int k = 0 ; k < digits.length ; k++){
                    if ( i == j || j == k || k == i )continue ;
                    if ( digits[i] == 0 || digits[k]%2 != 0) continue ;
                    int number = digits[i]*100 + digits[j]*10 + digits[k];
                    set.add(number);
                }
            }
        }
        int[] ans = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            ans[idx++] = num;
        }
        Arrays.sort(ans);
        return ans ;
    }
}