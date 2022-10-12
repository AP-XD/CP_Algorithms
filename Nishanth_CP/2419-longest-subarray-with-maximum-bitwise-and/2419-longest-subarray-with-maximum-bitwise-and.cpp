class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int a = INT_MIN;
        for(int i:nums){
            if(i>a){
                a= i;
            }
        }
        cout<<a<<" ";
        int f=0,r1,r2;
        int ans=0;
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]==a && f==0){
                r1 = i;
                f=1;
            }
            else if(nums[i]!=a && f==1){
                r2 = i;
                ans = max(ans,r2-r1);
                f=0;
            }
        }
        if(f==1){
            ans = max(ans,n-r1);
        }
        return ans;
    }
};