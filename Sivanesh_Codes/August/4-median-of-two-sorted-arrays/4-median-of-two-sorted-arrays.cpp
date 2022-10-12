class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n=nums1.size();
        int m=nums2.size();
        int t=n+m;
        int i=0;
        int a=0;
        int b=0;
        vector<int> v;
        double ans;
        while(i<=(n+m)/2 && a<n && b<m)
        {
            if(nums1[a]<=nums2[b])
            {
                ans=nums1[a];
                v.push_back(nums1[a]);
                a++;
            }
            else
            {
                ans=nums2[b];
                v.push_back(nums2[b]);
                b++;
            }
            i++;
        }
        while(i<=(n+m)/2 && a<n)
        {
            ans=nums1[a];
            v.push_back(nums1[a++]);
            i++;
        }
        while(i<=(n+m)/2 && b<m)
        {
            ans=nums2[b];
            v.push_back(nums2[b++]);
            i++;
        }
        cout<<i<<" ";
        if(t%2==0)
        {
            int x=v.size()-2;
            ans=v[x]+v[x+1];
            ans=ans/(double)2;
        }
        return ans;
    }
};