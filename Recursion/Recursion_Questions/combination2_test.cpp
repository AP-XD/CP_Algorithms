#include<bits/stdc++.h>
using namespace std;

void combination(vector<int>& vec,vector<int> &v,int target,int i,vector<vector<int>>& res){
    if(target==0){
        res.push_back(v);
        return;
    }
    for(int j=i;j<vec.size();j++){
        if(j>i&&vec[j]==vec[j-1])
        continue;
        if(vec[j]>target)
          break;
        v.push_back(vec[j]);
        combination(vec,v,target-vec[j],j+1,res);
        v.pop_back();
    }
}

vector<vector<int>> combinationSum2(vector<int>& candidates, int target){
    sort(candidates.begin(),candidates.end());
    vector<vector<int>> res;
    vector<int> v;
    combination(candidates,v,target,0,res);
    return res;
}

int main() {
  vector<int> v{10,1,2,7,6,1,5};
  vector < vector < int >> comb = combinationSum2(v, 8);
  cout << "[ ";
  for (int i = 0; i < comb.size(); i++) {
    cout << "[ ";
    for (int j = 0; j < comb[i].size(); j++) {
      cout << comb[i][j] << " ";
    }
    cout << "]";
  }
  cout << " ]";
}
