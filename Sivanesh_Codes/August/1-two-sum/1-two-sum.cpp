class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> m;
        vector<int> ans;
        for(int i=0;i<nums.size();i++)
        {
            int x=target-nums[i];
            if(m[x]!=0)
            {
                ans.push_back(m[x]-1);
                ans.push_back(i);
            }
            m[nums[i]]=i+1;
        }
        return ans;
    }
};