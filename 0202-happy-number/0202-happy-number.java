class Solution {
    int sum(int n) {
        int currSum = 0;
        int digits;

        while (n > 0) {
            digits = n % 10;
            currSum += digits * digits;
            n = n / 10;
        }

        return currSum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sum(n);
        }

        return n == 1;
    }
}