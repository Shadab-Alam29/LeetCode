class Solution {
    public int totalFruit(int[] fruits) {
        
//         int i = -1 ;
//         int j = -1 ;
//         int max = -1;
//         int arr[]=new int [2];
//         for ( int k : fruits ){
//             if ( i==k )
//                 arr[0]++;
//             else if ( j==k )
//                 arr[1]++;
//             else{
//                 arr[0]=arr[1];
//                 i=j;
//                 j=k;
//                 arr[1]=1;
//             }
//             max = Math.max(max,arr[0]+arr[1]);
//         }
//         return max;
//     }
// wrong tc for 64
// }

        int fr[] = new int[100001];
        int type = 0;
        int max = 0;
        int s=0;
        for(int i=0;i<fruits.length;i++){
            int f = fruits[i];
            if(fr[f]==0)type++;
            fr[f]++;
            while(type>2){
                int sf = fruits[s];
                fr[sf]--;
                if(fr[sf]==0)type--;
                s++;
            }
            int pick = i-s+1;
            max = Math.max(max,pick);
        }
        return max;
    }
}