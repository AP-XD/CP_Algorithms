class Solution {
public:
    
    vector<int> twoSum(vector<int>& numbers, int target) {
        int n=numbers.size();
        vector<int> ans(2);
        int l=0;
        int r=n-1;
        while(l<r)
        {
            if(numbers[r]+numbers[l]==target)
            {
                ans[0]=l+1;
                ans[1]=r+1;
                break;
            }
            else if(numbers[r]+numbers[l]<target)
                l++;
            else
                r--;
        }
        return ans;
    }
};