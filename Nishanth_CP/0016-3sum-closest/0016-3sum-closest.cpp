class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {

        sort(nums.begin(),nums.end());
        int n = nums.size();
        int i=0;
        long long ans = INT_MIN,mini = INT_MAX;
        while(i<n){
            int j=i+1,k = n-1;
            while(j<k){
                if(abs(target - (nums[i] + nums[j] + nums[k]))<mini){
                    mini =abs(target - (nums[i] + nums[j] + nums[k]));
                    ans = nums[i] + nums[j] + nums[k];
                }
                if(nums[i] + nums[j] + nums[k]>target){
                    k--;
                }
                else{
                    j++;
                }
            }
            i++;
        }
        return ans;
    }
};