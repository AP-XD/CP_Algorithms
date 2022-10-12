class Solution {
public:
    int solution(vector<int>& nums, int target,int l,int r)
    {
        int mid=(l+r)/2;
        if(nums[mid]==target)
            return mid;
        if(l>=r)
            return -1;
        if(nums[mid]<target)
            return solution(nums,target,mid+1,r);
        else
            return solution(nums,target,l,mid);
    }
    int search(vector<int>& nums, int target) {
        return solution(nums,target,0,nums.size()-1);
    }
};