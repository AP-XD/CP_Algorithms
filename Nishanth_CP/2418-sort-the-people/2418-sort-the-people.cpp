    bool cmp(const pair<int,string> &a,const pair<int,string> &b){
    return a.first > b.first;
}

class Solution {

public:

    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        vector<pair<int,string>> ar(names.size());
        int n=names.size();
        for(int i=0;i<n;i++){
            ar[i] = {heights[i],names[i]};
        }
        sort(ar.begin(),ar.end(),cmp);
        vector<string> ans;
        for(auto i:ar){
            ans.push_back(i.second);
        }
        return ans;
    }
};