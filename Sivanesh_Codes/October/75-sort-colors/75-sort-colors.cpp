class Solution {
public:
    void sortColors(vector<int>& nums) {
    //     int no=0,n1=0,n2=0;
    //     int j=0;
    //     for(auto x:nums)
    //     {
    //         if(x==0)
    //             no++;
    //         else if(x==1)
    //             n1++;
    //         else
    //             n2++;
    //     }
    //     while(no--)
    //         nums[j++]=0;
    //     while(n1--)
    //         nums[j++]=1;
    //     while(n2--)
    //         nums[j++]=2;
    // }
        int low=0;
        int mid=0;
        int high=nums.size()-1;
        while(mid<=high)
        {
            switch(nums[mid])
            {
                case 0:
                    swap(nums[low++],nums[mid++]);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums[high--],nums[mid]);
                    break;
            }
        }
    }
};