class Solution {
    public int maxDistance(int[] stalls, int k ) {
        int ans =-1;
        Arrays.sort(stalls);
        int n = stalls.length;
        int max = stalls[n-1]-stalls[0];
        int start =1;
        int end = max;
        while(start <=end){
            int mid = start +(end -start)/2;
            int c = placeCows(stalls ,mid);
            if(c>=k){
                ans = mid;
                start=mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return ans ;
        // for(int d =1 ; d<=max;d++){
        //     int c =placeCows(stalls,d);
        //     if(c >= k){
        //         ans=d;
        //     }
        //     else break;
        // }
        // return ans;
        
    }
    int placeCows(int stalls[],int d){
        int c=1;
        int p=stalls[0];
        for(int i = 1 ; i < stalls.length ; i++ ){
            if(stalls[i]-p >= d){
                c++;
                p=stalls[i];
            }
        }
        return c ;
    }
}