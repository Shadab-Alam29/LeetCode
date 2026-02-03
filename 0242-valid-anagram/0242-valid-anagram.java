class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
       char[] t1 = t.toCharArray();
       char[] s1 = s.toCharArray();
       Arrays.sort(s1);
       Arrays.sort(t1);
       return Arrays.equals(s1,t1);
    //    for(int i =0;i<s.length();i++){
    //     boolean f=false;
    //     for(int j=0;j<t.length();j++){
    //     if(s.charAt(i)==t1[j]){
    //         f=true;
    //         t1[j]=' ';
    //         break;
    //     }
    //    }
    //    if(!f)return false;
    // }
    // return true;
}
}
