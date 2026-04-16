class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int f = 0, t = 0;

        if (bills[0] != 5) return false;

        for (int b : bills) {
            if (b == 5) {
                f++;
            }
            else if (b == 10) {
                if (f >= 1) {
                    f--;
                    t++;
                } else {
                    return false;
                }
            }
            else { // b == 20
                if (t > 0 && f > 0) {
                    t--;
                    f--;
                }
                else if (f >= 3) {
                    f -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
};