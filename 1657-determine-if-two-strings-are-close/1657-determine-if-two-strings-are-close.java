class Solution {
    public boolean closeStrings(String word1, String word2) {
        int m = word1.length() ;
        int n = word2.length() ; 

        if ( m != n) return false ;
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        for ( int i = 0 ; i < m ; i++ ){
            if (map1.containsKey(word1.charAt(i)))  map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
            else  map1.put(word1.charAt(i), 1);
            }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for ( int i = 0 ; i < n ; i++){
            if  (map2.containsKey(word2.charAt(i))) map2.put (word2.charAt(i) , map2.get(word2.charAt(i))+1);
            else map2.put(word2.charAt(i), 1);
        }
        
        for (int i = 0; i < n; i++) {
            if (!map2.containsKey(word1.charAt(i)))
                return false;

            if (!map1.containsKey(word2.charAt(i)))
                return false;
        }

        ArrayList<Integer> list1 = new ArrayList<>(map1.values());
        ArrayList<Integer> list2 = new ArrayList<>(map2.values());

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}