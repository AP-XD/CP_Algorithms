class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int left=j+1;
                int right=n-1;
                long long req=(long long)target-(long long)nums[i]-(long long)nums[j];
                while(left<right)
                {
                    long long x = (long long)nums[left]+(long long)nums[right];
                    if(x == req)
                    {
                        vector<int> v{nums[i],nums[j],nums[left],nums[right]};
                        ans.push_back(v);
                        while(left<right && nums[left]==v[2]) left++;
                        while(left<right && nums[right]==v[3]) right--;
                    }
                    else if(x<req)
                        left++;
                    else
                        right--;
                }
                while(j<n-1 && nums[j]==nums[j+1])
                    j++;
            }
            while(i<n-1 && nums[i]==nums[i+1])
                i++;
        }
        return ans;
    }
};