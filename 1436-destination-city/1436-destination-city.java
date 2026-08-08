class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        for (List<String> i : paths) {
            map.put(i.get(0), i.get(1));
        }
        for (List<String> path : paths) {
            if (!map.containsKey(path.get(1))) {
                return path.get(1);
            }
        }
        return "" ;
    }
}