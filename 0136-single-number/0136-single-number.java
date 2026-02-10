class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer, Integer> m = new HashMap<>();
       for(int i : nums){
        int c= m.getOrDefault(i,0);
        m.put(i,c+1);
        }
         for (int i : m.keySet())
         {
            if(m.get(i)==1)return i; 
         } 
         return -1; 
       }
}

      