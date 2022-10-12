class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        map<int,int> m;
        int n=nums.size();
        if(n==0)
            return 0;
        int m1=*min_element(nums.begin(),nums.end());
        for(auto i:nums)
            m[i]++;
        int maxc=-1;
        int c=1;
        cout<<m1<<"\n";
        for(auto i:m)
        {
            int x=i.first;
            cout<<"1."<<x<<" || ";
            if(x==m1+1)
            {
                c++;
                m1=x;
            }
            else
            {
                cout<<"2."<<maxc<<":"<<c<<"\n";
                maxc=max(maxc,c);
                c=1;
                m1=x;
            }
        }
        maxc=max(maxc,c);
        return maxc;
    }
};