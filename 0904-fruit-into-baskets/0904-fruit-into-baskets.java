class Solution {
    public int totalFruit(int[] fruits) {
        int fr[] = new int[100001];
        int type = 0;
        int max = 0;
        int s =0;
        for(int e=0;e<fruits.length;e++){
            int f = fruits[e];
            if(fr[f]==0)type++;
            fr[f]++;
            while(type>2){
                int sf = fruits[s];
                fr[sf]--;
                if(fr[sf]==0)type--;
                s++;
            }
            int pick = e-s+1;
            max = Math.max(max,pick);
        }
        return max;

    }
}