class Solution {
    public boolean checkInclusion(String s1, String s2) {

            int f1[] = new int [26];
            int k =s1.length();
            for(char ch :s1.toCharArray())f1[ch-'a']++;
            int f2[] = new int [26];
            for(int i =0;i<s2.length();i++){
                char ch = s2.charAt(i);
                f2[ch-'a']++;
                if(i<k-1)continue;
                if(Arrays.equals(f1,f2))return true;
                int sin=i-(k-1);
                char r =s2.charAt(sin);
                f2[r-'a']--;
            }
            return false;
    //     int k = s1.length();
    //     for(int i =0;i<=s2.length()-k;i++){
    //         String sub=s2.substring(i,i+k);
    //         if ( isAnagram(s1,sub))return true;
    //     }
    //    return false;

        
    }
    //  public boolean isAnagram(String s, String t) {

    //     int f1[]=new int [26];
    //     for(char ch : s.toCharArray()){
    //         f1[ch-'a']++;
    //     }
    //     for(char ch :t.toCharArray()){
    //         f1[ch-'a']--;
    //     }
    //     for(int i :f1){
    //         if(i!=0)
    //         return false;
    //     }
    //     return true;
    // }
}