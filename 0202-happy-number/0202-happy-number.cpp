class Solution {
public:

        int sum(int n)
        {
        int currsum=0;
        int temp=n;
        int digits=0;
        while(n>0)
        {
            digits =  n%10;
            currsum= currsum+ digits*digits;
            n=n/10;
        }
        return currsum;
        }
        
    bool isHappy(int n) {
        unordered_set<int>set;
        while(n!=1 && set.count(n)==0)
        {
            set.insert(n);
            n=sum(n);
        }

       return n==1;
 
    }
};