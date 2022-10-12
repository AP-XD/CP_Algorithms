class Solution {
public:
    long long solve(int ind,int n,vector<int> &cost,vector<int> &dp){
        
        if(ind==n){
            return 0;
        }

        if(dp[ind]!=-1) return dp[ind];
        long long ans1 =INT_MAX,ans2=INT_MAX;
        if(ind+1<=n) ans1 = cost[ind] + solve(ind+1,n,cost,dp);
        if(ind+2<=n) ans2 = cost[ind] + solve(ind+2,n,cost,dp);
        
        return dp[ind] = min(ans1,ans2);
        
    }
    
    
    int minCostClimbingStairs(vector<int>& cost) {
        vector<int> dp(cost.size()+1,-1);
        long long ans = solve(0,cost.size(),cost,dp);
        vector<int> dp1(cost.size()+1,-1);
        ans = min(ans,solve(1,cost.size(),cost,dp1));
        return ans;
    }
};