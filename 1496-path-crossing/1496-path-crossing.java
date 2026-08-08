class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0 ; 
        int y = 0 ;
        set.add(x + " " + y);
        for (char ch : path.toCharArray()) {
            if (ch == 'N') y++;
            if (ch == 'S') y--;
            if (ch == 'E') x++;
            if (ch == 'W') x--;
         String point = x + " " + y ;
          if (set.contains(point)) 
                return true;
            set.add(point);
        }
        return false ;
    }
}