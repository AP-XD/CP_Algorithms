class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n=nums.size();
        vector<int> ans(n);
        int a=0;
        int b=n-1;
        for(int i=n-1;i>=0;i--)
        {
            if(abs(nums[a])>=abs(nums[b]))
            {
                ans[i]=nums[a]*nums[a];
                a++;
            }
            else
            {
                ans[i]=nums[b]*nums[b];
                b--;
            }
        }
        return ans;
    }
};