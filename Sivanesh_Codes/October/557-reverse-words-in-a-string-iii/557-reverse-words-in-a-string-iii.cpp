class Solution {
public:
    string reverseWords(string s) {
        string ans="";
        string temp="";
        for(auto i:s)
        {
            if(i!=' ')
            {
                temp=i+temp;
            }
            else
            {
                ans+=temp;
                temp="";
                ans+=" ";
            }
        }
        ans+=temp;
        return ans;
    }
};