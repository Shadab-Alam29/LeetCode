class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if (len == 1) {
            return flowerbed[0] == 0 ? n <= 1 : n == 0;
        }
       for ( int i = 0 ; i < len ;i++){
        if ( flowerbed[i] == 0){
            if (( i == 0 ) && ( flowerbed[i+1] != 1 )){
                n-- ;
                flowerbed[i]=1 ;
            }
            else if  ((i > 0 && i < len - 1) && (flowerbed[i+1] !=1) && (flowerbed[i-1] !=1 )){
                n--;
                flowerbed[i]=1 ;
            }

            else if (( i == len-1) && (flowerbed[i-1]!=1)){
                n--;
                flowerbed[i]=1;
            }
        }
        }
        System.out.print(n);
        return n <= 0 ;
    }
}