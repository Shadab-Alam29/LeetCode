class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while( n > 0){
            int digit = n%10;
            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1);
            } else {
                map.put(digit, 1);
            }
            n = n / 10;
        }
        int ans = 0 ; 
        int min = Integer.MAX_VALUE;
        for (int i : map.keySet()) {
            if (map.get(i) < min) {
                min = map.get(i);
                ans = i;
            }
        }
        return ans ;
    }
}