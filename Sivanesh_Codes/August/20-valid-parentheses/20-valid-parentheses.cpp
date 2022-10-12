class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        st.push(s[0]);
        int n=s.length();
        for(int i=1;i<n;i++)
        {
            if(s[i]=='(' || s[i]=='[' || s[i]=='{')
            {
                st.push(s[i]);
            }
            else
            {
                if(st.size()==0)
                    return false;
                if(s[i]==')' && st.top()=='(')
                    st.pop();
                else if(s[i]==']' && st.top()=='[')
                    st.pop();
                else if(s[i]=='}' && st.top()=='{')
                    st.pop();
                else
                    return false;
                
            }
        }
        return (st.size()==0);
    }
};