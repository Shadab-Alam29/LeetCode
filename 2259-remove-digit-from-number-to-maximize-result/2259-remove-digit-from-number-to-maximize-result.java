class Solution {
    public String removeDigit(String number, char digit) {
        String max = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String s = number.substring(0, i) + number.substring(i + 1);
                if (s.compareTo(max) > 0) {
                    max = s;
                }
            }
        }

        return max;
    }
}