class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        for(int i =0;i<=s2.length()-k;i++){
            String sub=s2.substring(i,i+k);
            if ( isAnagram(s1,sub))return true;
        }
       return false;
        
    }
     public boolean isAnagram(String s, String t) {

        int f1[]=new int [26];
        for(char ch : s.toCharArray()){
            f1[ch-'a']++;
        }
        for(char ch :t.toCharArray()){
            f1[ch-'a']--;
        }
        for(int i :f1){
            if(i!=0)
            return false;
        }
        return true;
    }
}