class Solution {
public:
    set<vector<int>> ans;
    vector<int> v;
    void solution(vector<int>& c, int t,int idx)
    {
       if(t==0)
       {
           ans.insert(v);
           return;
       }
        if(t<0 || idx==c.size())
            return;
        v.push_back(c[idx]);
        solution(c,t-c[idx],idx);
        v.pop_back();
        solution(c,t,idx+1);
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        solution(candidates,target,0);
        vector<vector<int>> ans1;
        for(auto i:ans)
            ans1.push_back(i);
        return ans1;
    }
};