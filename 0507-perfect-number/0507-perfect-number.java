class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1;
        int i = 2 ;
        while(i <= num/2) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == num;
    }
}