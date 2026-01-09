import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
    PriorityQueue<BigInteger> pq = new PriorityQueue<>();
    int n=nums.length;
    for(String val : nums){
       BigInteger add = new BigInteger(val);
        pq.add(add);
        if(pq.size()>k){
            pq.remove();
            }
        }
        String ans = String.valueOf(pq.peek());
        return ans ;
    }
}