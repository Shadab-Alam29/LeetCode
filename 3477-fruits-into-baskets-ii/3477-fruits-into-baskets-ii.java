class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      int ans = fruits.length;
       for(int x : fruits){
        for (int i = 0 ; i <baskets.length;i++){
            if(x<=baskets[i]){
                --ans;
                baskets[i]=0;
                break;
            }
        }
       }
       return ans ;
    }
}