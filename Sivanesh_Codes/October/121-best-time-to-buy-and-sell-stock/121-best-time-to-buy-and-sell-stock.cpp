class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int m=prices[0];
        int ans=0;
        for(int i=1;i<prices.size();i++)
        {
            m=min(m,prices[i]);
            int op=prices[i]-m;
            ans=max(ans,op);
        }
        return ans;
    }
};