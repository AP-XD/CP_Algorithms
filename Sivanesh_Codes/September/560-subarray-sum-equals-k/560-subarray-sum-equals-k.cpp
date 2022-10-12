class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        vector<int> pre(nums.size());
        int n=nums.size();
        map<int,int> m;
        long ans = 0;
        pre[0]=nums[0];
        for(int i=0;i<n;i++){
            if(i) pre[i]=nums[i]+pre[i-1];
            if (pre[i] == k){
                ans++;
            }
            if(m[pre[i]-k]>0){
                ans += m[pre[i]-k];
            }
            m[pre[i]]++;
        }
        
        return ans;
    }
};