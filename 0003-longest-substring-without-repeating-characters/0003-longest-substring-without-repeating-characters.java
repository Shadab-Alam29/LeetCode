class Solution {
  public int lengthOfLongestSubstring(String s) {
    int max =0 ;
    int start = 0;
    int fr []= new int[256];
    for(int e = 0 ; e < s.length() ; e++ ){
        char ch = s.charAt(e);
        fr[ch]++;
        
        while(fr[ch]>1){
            char sch = s.charAt(start++);
            fr[sch]--;
        }
    int size = e-start+1;
    max = Math.max(max,size);
    }
    return max;
  }
}


