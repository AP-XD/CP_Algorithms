class Solution {
public:
    bool isPalindrome(int x) {
        string s=to_string(x);
        reverse(s.begin(),s.end());
        long y=stol(s);
        if(x==y)
            return true;
        else
            return false;
    }
};