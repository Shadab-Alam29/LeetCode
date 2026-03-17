class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        int ans = 0;

        unordered_set<char> st;
        for (char c : jewels) st.insert(c);
        for (char stone : stones) 
            if (st.count(stone))
                ans++;
        return ans;
    }
};