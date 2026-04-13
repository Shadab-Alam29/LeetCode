class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (target > x+y) return false ;
        if ( target % findGCD(x ,y) == 0 )return true;
        else return false ;
    }
    public static int findGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}