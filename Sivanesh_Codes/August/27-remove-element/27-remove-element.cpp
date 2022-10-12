class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int c=nums.size();
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            if(nums[i]==val)
            {
                nums.erase(nums.begin()+i);
                nums.push_back(-1);
                c--;
                i--;
            }
                
        }
        return c;
    }
};