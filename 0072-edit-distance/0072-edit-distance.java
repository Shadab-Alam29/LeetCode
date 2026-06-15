class Solution {
    public int minDistance(String word1, String word2) {
        int i = 0 ;
        int j = 0 ;
        Integer dp[][] = new Integer [word1.length()][word2.length()];
        return moves(word1,word2,i,j,dp);
    }
    int moves ( String w1 , String w2 , int i , int j,Integer dp [][] ){
        if ( w1.length() == i ) return w2.length()-j ;
        if ( w2.length() == j ) return w1.length()-i ;
        if ( dp[i][j]!=null) return dp[i][j];

        if (w1.charAt(i)==w2.charAt(j)){
            return dp[i][j] = moves(w1,w2,i+1,j+1,dp);
        }
        else {
            int a = 1 + moves(w1,w2,i,j+1,dp);
            int b = 1 + moves(w1,w2,i+1,j,dp);
            int c = 1 + moves(w1,w2,i+1,j+1,dp);
            return dp[i][j] = Math.min(a,Math.min(b,c));  
    }

    }
}

// without dp TLE
// class Solution {
//     public int minDistance(String word1, String word2) {
//         int i = 0 ;
//         int j = 0 ;
//         return moves(word1 , word2 , i , j);
//     }
//     int moves ( String w1 , String w2 , int i , int j ){
//         if ( w1.length() == i ) return w2.length()-j ;
//         if ( w2.length() == j ) return w1.length()-i ;

//         if (w1.charAt(i)==w2.charAt(j)){
//             return moves(w1,w2,i+1,j+1);
//         }
//         else {
//             int a = 1 + moves(w1,w2,i,j+1);
//             int b = 1 + moves(w1,w2,i+1,j);
//             int c = 1 + moves(w1,w2,i+1,j+1);
//             return Math.min(a,Math.min(b,c));  
//     }

//     }
// }