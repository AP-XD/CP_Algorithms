class Solution {
public:
    
    int solve(int ind,int n,vector<int> nums,vector<int> &dp){
        if(ind>=n){
            return 0;
        }
        if(dp[ind]!=-1) return dp[ind];
        int not_take = 0+ solve(ind+1,n,nums,dp);
        int take = nums[ind] + solve(ind+2,n,nums,dp);
        
        
        return dp[ind] = max(take,not_take);
        
    }
    int rob(vector<int>& nums) {
        vector<int> dp(nums.size()+1,-1);
        return solve(0,nums.size(),nums,dp);
    }
};