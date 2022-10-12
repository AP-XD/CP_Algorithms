class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        int c1=0;
        int c2=0;
        int e1=0;
        int e2=0;
        for(int i=0;i<nums.size();i++)
        {
            if(e1==nums[i]) c1++;
            else if(e2==nums[i]) c2++;
            else if(c1==0)
            {
                e1=nums[i];
                c1=1;
            }
            else if(c2==0)
            {
                e2=nums[i];
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        int x1=0;
        int x2=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==e1)
                x1++;
            else if(nums[i]==e2)
                x2++;
        }
        if(x1>floor(nums.size()/3))
            ans.push_back(e1);
        if(x2>floor(nums.size()/3))
            ans.push_back(e2);
        return ans;
    }
};