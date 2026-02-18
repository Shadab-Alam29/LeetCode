class Solution {
  public int lengthOfLongestSubstring(String s) {
int max =0;
    for(int i =0;i<s.length();i++){
        int fr[] = new int [256];
        int c =0;
    for(int j =i;j<s.length();j++){
        char ch = s.charAt(j);
        if(fr[ch]==1)break;
        fr[ch]++;
        c++;
     }
     max = Math.max(max,c);
    }
    return max;
  }
}

