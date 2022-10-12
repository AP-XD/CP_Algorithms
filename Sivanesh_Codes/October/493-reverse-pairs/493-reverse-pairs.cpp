class Solution {
public:
    int ans=0;
    int merge(vector<int> &nums,int l,int mid,int r)
    {
        int j=mid+1;
        int cnt=0;
        for(int i=l;i<mid+1;i++)
        {
             while(j<=r && nums[i] > 2LL*nums[j])
                j++;
            cnt+=(j-(mid+1));
        }
           
        int l1=mid-l+1;
        int l2=r-mid;
        vector<int> arr1(l1);
        vector<int> arr2(l2);
        for(int i=0;i<l1;i++)
            arr1[i]=nums[l+i];
        for(int j=0;j<l2;j++)
            arr2[j]=nums[mid+1+j];
        int i=0;
        j=0;
        int k=l;
        while(i<l1 && j<l2)
        {
            if(arr1[i] <= arr2[j])
                nums[k++]=arr1[i++];
            else
                nums[k++]=arr2[j++];
        }
        while(i<l1)
            nums[k++]=arr1[i++];
        while(j<l2)
            nums[k++]=arr2[j++];
        return cnt;
    }
    int mergesort(vector<int> &nums,int l,int r)
    {
        if(l>=r)
            return 0;
        int mid=l+(r-l)/2;
        int cnt=mergesort(nums,l,mid);
        cnt+=mergesort(nums,mid+1,r);
        cnt+=merge(nums,l,mid,r);
        return cnt;
    }
    int reversePairs(vector<int>& nums) {
        int l=0;
        int r=nums.size()-1;
        return mergesort(nums,l,r);
    }
};