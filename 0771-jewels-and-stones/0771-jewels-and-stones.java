class Solution {
  public int numJewelsInStones(String jewels, String stones) {
    int ans = 0;
    char[] s = jewels.toCharArray();
    Set<Character> set = new HashSet<>();
    for (char c : s) set.add(c);
    for (char stone : stones.toCharArray())
      if (set.contains(stone))
        ++ans;

    return ans;
  }
}