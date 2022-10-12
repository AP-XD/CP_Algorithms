class Solution {
public:
    string ans="1";
    int i=1;
    string countAndSay(int n) {
        if(i==n)
            return ans;
        string n1="";
        for(int j=0;j<ans.length();j++)
        {
            int cnt=1;
            //cout<<ans[j+10]<<" ";
            while(ans[j]==ans[j+1])
            {
                cnt++;
                j++;
            }
            if(cnt>1)
            {
                n1+=to_string(cnt)+ans[j-1];
            }
            else
                n1+=to_string(cnt)+ans[j];
            cnt=0;
        }
        ans=n1;
        if(i<n)
        {
            i++;
            countAndSay(n);
        }
        return ans;
    }
};