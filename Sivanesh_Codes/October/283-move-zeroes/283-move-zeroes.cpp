class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int c=0;
        int cur=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)
                c++;
            else
                nums[cur++]=nums[i];
        }
        for(int i=cur;i<nums.size();i++)
            nums[i]=0;
    }
};