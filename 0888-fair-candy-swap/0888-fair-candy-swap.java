class Solution {
    public int[] fairCandySwap(int[] alic, int[] bob) {
        int total_A = 0 ; 
        int total_B = 0 ; 
        for ( int i : alic ){
            total_A += i ;
        }
        HashSet<Integer> set = new HashSet<>();
        for ( int i : bob){
            total_B += i ;
            set.add(i);
        }
        int ans[] = new int[2];
        for ( int i : alic){
            int b = (total_B - total_A)/2 + i;
            if ( set.contains(b)){
                ans[0] = i;
                ans[1] = b;
                break;
            }
        }
        return ans ;
    }
}