class Solution {
public:
    vector<vector<int>> ans;
    vector<int> v;
    void solution(vector<int>& c, int t,int idx)
    {
       if(t==0)
       {
           ans.push_back(v);
           return;
       }
        if(t<0 || idx==c.size())
            return;
        for(int i=idx;i<c.size();i++)
        {
            if(i>idx && c[i]==c[i-1]) continue;
            v.push_back(c[i]);
            solution(c,t-c[i],i+1);
            v.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        solution(candidates,target,0);
        return ans;
    }
};