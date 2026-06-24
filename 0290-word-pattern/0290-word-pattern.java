class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sarr = s.split(" ");
        if (sarr.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(sarr[i])) {
                    return false;
                }
            } else {
                if (used.contains(sarr[i])) {
                    return false;
                }
                map.put(c, sarr[i]);
                used.add(sarr[i]);
            }
        }
        return true;
    }
}

// 41 / 44

// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         String[] sarr = s.split(" ");
//         HashMap<Character, String> map = new HashMap<>();
//           if (sarr.length != pattern.length()) {
//             return false;
//         }
//         for(int i = 0 ; i < pattern.length();i++){
//             if (map.containsKey(pattern.charAt(i))){
//                 if ( !map.get(pattern.charAt(i)).equals(sarr[i]))return false;
//             }
//             else {
//                 map.put(pattern.charAt(i),sarr[i]);
//             }
//         }
//         return true ;
//     }
// }