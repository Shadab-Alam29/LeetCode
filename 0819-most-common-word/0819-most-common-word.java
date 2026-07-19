class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

    String[] words = paragraph.toLowerCase().split("[!?',;. ]+");

    HashSet<String> set = new HashSet<>();
        for (String word : banned) {
            set.add(word.toLowerCase());
        }

    HashMap<String, Integer> map = new HashMap<>();
    String ans = "";
    int max = 0;
  for (String word : words) {
            if (set.contains(word))
                continue;
            if (map.containsKey(word)) 
                map.put(word, map.get(word) + 1);
            else 
                map.put(word, 1);
            
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }
        return ans;
    }
}