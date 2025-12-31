class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
           return false; 
        }
        long check=0;
        int n = x;
        while(n>0){                 //x>0
            int last = n%10;
            check = check*10+last;
            n=n/10;
        }
        if(check==x){
            return true; 
        }
        else{
            return false;
        }
    }
}