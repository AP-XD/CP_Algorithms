class Solution {
public:
    int solve(int ind,int n,vector<int> &dp){
        
        if(ind==n){
            return 1;
        }
        if(dp[ind]!=-1) return dp[ind];
        int ans =0;
        if(ind+1<=n) ans += solve(ind+1,n,dp);
        if(ind+2<=n) ans += solve(ind+2,n,dp);
        return dp[ind] = ans;
    }
    
    int climbStairs(int n) {
        vector<int> dp(n+1,-1);
        return solve(0,n,dp);
    }
};