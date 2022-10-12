class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int ans=0;
        int n=s.length();
        if(n==0)
            return 0;
        int l=0;
        int r=0;
        map<char,int> m;
        while(r<n)
        {
            if(m[s[r]]==0 || m[s[r]]<l)
            {
                int len=r-l+1;
                ans=max(ans,len);
                m[s[r]]=r+1;
                r++;
            }
            else
            {
                l=m[s[r]];
                m[s[r]]=r+1;
                r++;
            }
        }
        return ans;
    }
};