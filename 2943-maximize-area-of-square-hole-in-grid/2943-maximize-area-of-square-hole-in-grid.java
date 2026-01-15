class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hbars, int[] vbars) {
     Arrays.sort(hbars);
     Arrays.sort(vbars);
     int hstrip = 1 ;
     int vstrip = 1 ;

     int c = 1 ;
     int p = hbars[0] ;
     for (int i = 1 ; i< hbars.length ; i++){
        if(hbars[i] == p+1){
            c++;
            hstrip = Math.max(c , hstrip);
        }
        else {
            c = 1 ;
        }
        p = hbars[i];
     }
     c = 1 ;
     p= vbars[0];
     for (int i = 1 ; i< vbars.length ; i++){
        if(vbars[i] == p+1){
            c++;
            vstrip = Math.max(c , vstrip);
        }
        else {
            c = 1 ;
        }
        p = vbars[i];
     }
     int min = Math.min(hstrip,vstrip)+1;
     return min* min;
    }
}