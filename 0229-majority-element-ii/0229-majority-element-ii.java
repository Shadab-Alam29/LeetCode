class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int max =0;
        ArrayList<Integer> Max = new ArrayList<Integer>(); 
        for(int i : nums){
        int c= m.getOrDefault(i,0);
        m.put(i,c+1);
        }
        int n= nums.length;
         for (int i : m.keySet())
         {
            if(m.get(i)>n/3){
                Max.add(i); 
            }      
         } 
         return Max;
    }
}