class Solution {
    public String reverseWords(String s) {
        String words[] =s.split(" ");
        int len = words.length-1;
        String ans="";
        for (int i=len;i>=0;i--){
            if(words[i].length()==0)continue;
            ans= ans+words[i]+" ";
        }
        return ans.trim();
    }
}