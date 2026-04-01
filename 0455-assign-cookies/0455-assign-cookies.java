class Solution {
    public int findContentChildren(int[] g, int[] s) {
     Arrays.sort(g);
     Arrays.sort(s);
     int count = 0;
    int i = 0 ,j = 0 ;
    while(i<g.length && j<s.length){
        if(s[j]>=g[i]){
            count++;
            i++;
            j++;
        }
        else{
            j++;
        }
    }

    //  for(int i = 0 ; i< g.length;i++){
    //     for(int j = 0 ; j<s.length; j++){
    //         if(s[j]>=g[i]){
    //             count ++ ;
    //             s[j] = -1;
    //             break;
    //         }
    //     }
    //  }
     return count ;   
    }
}