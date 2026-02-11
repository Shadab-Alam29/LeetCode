class Solution {
    public int[] singleNumber(int[] nums) {
    int arr[] = new int[2];
       HashMap<Integer, Integer> m = new HashMap<>();
       for(int i : nums){
        int c= m.getOrDefault(i,0);
        m.put(i,++c);
        }
         for (int i : m.keySet())
         {
            if(m.get(i)==1)
            if(arr[0]==0)arr[0]=i;
            else arr[1]=i;
         } 
         return arr ;
       }
}

      