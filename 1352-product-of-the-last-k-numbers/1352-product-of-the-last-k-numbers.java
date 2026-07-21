class ProductOfNumbers {
        ArrayList<Integer> list = new ArrayList<>();
    public ProductOfNumbers() {
        list.add(1);
    }
    public void add(int num) {
        if (num == 0) {
            list.clear();
            list.add(1);
        }else{
            int i = list.get(list.size() - 1);
             list.add(i * num);
        }
    }
    public int getProduct(int k) {
        if (k >= list.size()) return 0;
         int n = list.size();
         return list.get(n - 1)/ list.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */