class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
    Arrays.sort(tokens);
        int score = 0 ;
        int maxscore = 0 ;
        int i = 0 ;
        int j = tokens.length-1;
        while (i <= j){
            if ( power >= tokens[i]){
                power -= tokens[i++];
                score ++;
                maxscore = Math.max(score,maxscore);
            }
            else if (score >= 1){
                power += tokens[j--];
                score--;
            }
            else {
                break ;
            }  
        }
    return maxscore;
    }
}