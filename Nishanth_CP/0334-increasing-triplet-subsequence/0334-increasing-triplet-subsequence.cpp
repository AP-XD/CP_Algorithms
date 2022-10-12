class Solution {
public:
    // long long solve(int ind,int c,int prev,vector<int>& nums,vector<vector<vector<int>>> &dp){
    //     if(c==0){
    //         return 1;
    //     }
    //     if(ind==nums.size()){
    //         return 0;
    //     }
    //     if(dp[ind][c][prev]!=-1) return dp[ind][c][prev];
    //     long long not_take = solve(ind+1,c,prev,nums,dp);
    //     long long take =0;
    //     if((c==3 || nums[ind]>nums[prev])) take = solve(ind+1,c-1,ind,nums,dp);
    //     return dp[ind][c][prev] = take + not_take;
    // }
    bool increasingTriplet(vector<int>& nums) {
        int a=INT_MAX,b=INT_MAX;
        for(auto i:nums)
        {
            if(a>=i)a=i;
            else if(b>=i)b=i;
            else return true;
        }return false;

        
        
        // int prev =0;
        // vector<vector<vector<int>>> dp(nums.size()+1,vector<vector<int>> (4,vector<int> (nums.size()+1,-1)));
        // long long ans = solve(0,3,prev,nums,dp);
        // if(ans!=0) return true;
        // else return false;
        
    }
};