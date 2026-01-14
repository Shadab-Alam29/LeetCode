class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int p=-1;
       int c=0;
       int t=0;
       for(int i=0;i<gas.length;i++){
        int d=gas[i]-cost[i];
        c+=d;
        t+=d;
        if(c<0){
            c=0;
            p=i;
        }
       }
       if(t>=0){
        return p+1;
       }
       return -1;
    }
}
