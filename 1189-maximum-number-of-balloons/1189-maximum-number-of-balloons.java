class Solution {
    public int maxNumberOfBalloons(String text) {
          int b = 0 ;
          int a = 0 ;
          int l = 0 ;
          int o = 0 ;
          int n = 0 ;
          int s = 0 ;
          for( char i : text.toCharArray()){
            if (i == 'b') b++;
            if (i == 'a') a++;
            if (i == 'l') l++;
            if (i == 'o') o++;
            if (i == 'n') n++;
          }
          l /= 2;
          o /= 2;
          return Math.min(Math.min(Math.min(Math.min(b, a), l), o), n);
    }
}