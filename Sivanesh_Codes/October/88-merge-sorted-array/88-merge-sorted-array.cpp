class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int n1=n-1;
        int m1=m-1;
        int t=m+n-1;
        while(n1>=0)
        {
            nums1[t--]= m1>=0 && nums1[m1]>=nums2[n1] ? nums1[m1--] : nums2[n1--];
        }
    }
};