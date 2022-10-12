class Solution {
public:
    bool searchMatrix(vector<vector<int>>& nums, int target) {
        int m=nums.size();
        int n=nums[0].size();
        int l=0;
        int r=n*m-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int x=mid/n;
            int y=mid%n;
            if(nums[x][y]==target)
                return true;
            else if(nums[x][y]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
};