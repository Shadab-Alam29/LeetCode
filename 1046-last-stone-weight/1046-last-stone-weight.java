class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        for( int i : stones){
            list.add(i);
        }
         while (list.size() > 1) {
            Collections.sort(list);

            int a = list.get(list.size() - 1);
            int b = list.get(list.size() - 2);

            list.remove(list.size() - 1);
            list.remove(list.size() - 1);

            if (a != b) {
                list.add(a - b);
            }
        }
        if (list.size() == 1){
            return list.get(0);
        }
        return 0 ;
    }
}