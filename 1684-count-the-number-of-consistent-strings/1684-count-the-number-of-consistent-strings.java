class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       Boolean[] freq = new Boolean[26];

        for (char i : allowed.toCharArray()) {
            freq[i - 'a'] = true;
        }
        int count = 0 ;
        for (String i : words) {
            boolean valid = true;
              for (char j : i.toCharArray()) {
                if(freq[j-'a'] == null){
                    valid = false;
                    break;
                }
              }
              if (valid) {
                count++;
            }
        }
        return count ;
    }
}