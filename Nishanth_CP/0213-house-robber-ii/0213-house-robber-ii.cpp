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
        vector<int> dp1(nums.size()+1,-1);
        if(nums.size()==1) return nums[0];
        return max(solve(0,nums.size()-1,nums,dp),solve(1,nums.size(),nums,dp1));
    }
};