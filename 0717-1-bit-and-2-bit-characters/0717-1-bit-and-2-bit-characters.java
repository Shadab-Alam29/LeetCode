class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean c = true ; 
        for(int i = 0 ; i< bits.length; ){
            if(bits[i]==1){
                i=i+2;
                c= false;
            }
            else{
                i++;
                c=true;
            }
        }
        return c ;
    }
}