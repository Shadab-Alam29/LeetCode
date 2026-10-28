class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int i = 0;
        int give = 1;
        int ans[] = new int[num_people];
        while (candies > 0) {
            i = (give - 1)% num_people;
            int current = Math.min(candies, give);
            ans[i] += current;
            candies -= current;
            give++;
            
        }

        return ans;
    }
}