class Solution {
  public int countPrimeSetBits(int left, int right) {
    int count = 0;
    for (int i = left ; i<=right;i++){
        if( hammingWeight(i) == 2 || hammingWeight(i) == 3 ||hammingWeight(i) == 5 ||hammingWeight(i) == 7 ||hammingWeight(i) == 11 ||hammingWeight(i) == 13 ||hammingWeight(i) == 17 ||hammingWeight(i) == 19 )
        count ++;
    }
    return count ;
  }
   public int hammingWeight(int n) {
        int c = 0;
        while(n>= 1){
            if(n%2 == 1 )c++;
            n = n/2;
        }
        return c ;
    }
}