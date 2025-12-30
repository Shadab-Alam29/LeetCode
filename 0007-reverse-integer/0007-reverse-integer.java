import java.util.*;
class Solution {
    public int reverse(int x) {
      int ans=0;
        if(x<0) {
			x=x*-1;
			ans=rev(x)*-1;
		}
		else {
			 ans=rev(x);
		}
        return ans;
    }
    static int rev(int x) {
		int n=0;
		long j=0;
        while (x>0)
        {
            n=x%10;
            j=n+j*10;
            x=x/10;
        }
        if ((j > Integer.MAX_VALUE) || (j < Integer.MIN_VALUE)){
                return 0;
                }
       return (int) j;
		}
}