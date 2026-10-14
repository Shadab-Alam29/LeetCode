class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i : nums){
            if ( map.containsKey(i)){
                map.put(i , map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        int ans = 0 ; 
        for (int key :  map.keySet()){
            if ( map.get(key) == 3 ){
                int i = -1 , j= -1 , k= -1;
                for( int p = 0 ; p < nums.length ; p++){
                    if (nums[p] == key){
                        if( i == -1) i = p ;
                        else if(j == -1)j = p ;
                        else k = p ;
                    }
                }
                if ((j-i) == (k-j))ans++;
            }
        }
        return ans ;
    }
}