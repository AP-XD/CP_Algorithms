class Solution {
public:
    bool isPalindrome(string s) {
        transform(s.begin(),s.end(),s.begin(),::tolower);
        cout<<s<<" ";
        string ne="";
        for(auto i:s)
        {
            if(isalnum(i))
                ne+=i;
        }
        cout<<ne<<" ";
        string x=ne;
        reverse(ne.begin(),ne.end());
        return (x==ne);
    }
};