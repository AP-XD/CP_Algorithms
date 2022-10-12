class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int l=0;
        int r=nums.size()-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        // if(l>r)
        // {
        //     if(mid==nums.size()-1)
        //         return mid+1;
        //     return mid;
        // }
        return l;
    }
};