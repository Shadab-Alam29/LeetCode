class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int arr []=new int [spells.length];
        Arrays.sort(potions);
        for(int i =0 ;i<spells.length;i++){
            int s =0;
            int end=potions.length-1;
            int idx = -1;
            while(s<=end){
                int mid =s+(end-s)/2;
               if ((long) spells[i] * potions[mid] >= success) {
                    idx = mid ;
                    end =mid -1;
                }
                else{
                    s=mid+1;
                }
            }
            int c = 0 ;
            if(idx==-1){
            arr[i]=c;
            }
            else{
            c=potions.length-idx;
            arr[i]=c;
            }
        }
        return arr;
    }
}