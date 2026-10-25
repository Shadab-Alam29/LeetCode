class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      int ans = fruits.length;
       for(int i : fruits){
        for (int j = 0 ; j <baskets.length;j++){
            if(i<=baskets[j]){
                ans = ans - 1;
                baskets[j]=0;
                break;
              }
            }
       }
       return ans ;
    }
}