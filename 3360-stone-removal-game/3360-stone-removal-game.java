class Solution {
    public boolean canAliceWin(int n) {
        int turn = 10;
        while (n >= turn) {
            n -= turn;
            turn--;
            if (n < turn) {
                return true;
            }
            n -= turn;
            turn--;
            if (n < turn) {
                return false;
            }
        }
        return false;
    }
}
