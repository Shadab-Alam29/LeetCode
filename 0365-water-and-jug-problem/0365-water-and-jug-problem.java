class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (target > x+y) return false ;
        if ( target % GCD(x , y) == 0 )return true;
        else return false ;
    }
     int GCD(int a, int b) {
        if ( b == 0 )return a ;
        return  GCD(b ,a % b );
        
    }
}