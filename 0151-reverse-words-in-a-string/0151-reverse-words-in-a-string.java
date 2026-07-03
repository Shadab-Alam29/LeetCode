class Solution {
    public String reverseWords(String s) {
        String words[] =s.split("\\s+"); //rages
        int len = words.length-1;
        StringBuilder ans = new StringBuilder("");
        for (int i=len;i>=0;i--){
           // if(words[i].length()==0)continue;
            ans.append (words[i]+" ");
        }
        return ans.toString().trim();
    }
}