class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[] = new int [nums.length];
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int x : nums){
            arr[x-1]++;
        }
        for (int i = 0 ;i<nums.length;i++){
            if ( arr[i] == 0 ) numbers.add(i+1);
        }
        return numbers;
    }
}