class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a'] = i;
        }
        int st = 0 ;
        int ed = 0 ;
        for (int i = 0; i < s.length(); i++){
            ed = Math.max(ed, freq[s.charAt(i) - 'a']);

            if ( i == ed){
                ans.add(ed - st + 1);
                st = ed+1;
            }
        }
        return ans ;
    }
}