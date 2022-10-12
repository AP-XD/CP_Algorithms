class Solution {
public:
    vector<vector<int>> dp;
    int solution(int m,int n,int m1,int n1,vector<vector<int>> &dp)
    {
        if(m1==m-1 && n1==n-1)
            return 1;
        if(m1>=m || n1>=n)
            return 0;
        if(dp[m1][n1]!=-1) return dp[m1][n1];
        return dp[m1][n1]=solution(m,n,m1+1,n1,dp) + solution(m,n,m1,n1+1,dp);
    }
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m);
        for(int i=0;i<m;i++)
        {
            dp[i].resize(n);
            for(int j=0;j<n;j++)
                dp[i][j]=-1;
        }
        dp[m-1][n-1]=1;
        return solution(m,n,0,0,dp);;
    }
};