#include<bits/stdc++.h>
using namespace std;

void combsum2(vector<int> vec,vector<int> v,int target,int i,set<vector<int>> &res,int sum){
    if(i>=vec.size()){
        if(sum==target){
            res.insert(v);
        }
        return;
    }
    v.push_back(vec[i]);
    sum+=vec[i];
    combsum2(vec,v,target,i+1,res,sum);
    v.pop_back();
    sum-=vec[i];
    combsum2(vec,v,target,i+1,res,sum);
}

vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
    set<vector<int>> res;
    vector<int> v;
    combsum2(candidates,v,target,0,res,0);
    vector<vector<int>> answer;
    for(auto a:res){
        answer.push_back(a);
    }
    return answer;
}
        


int main(){
    vector<int> vec={10,1,2,7,6,1,5};
    sort(vec.begin(),vec.end());
    int target = 8;
    vector<vector<int>> res = combinationSum2(vec,target);
    for(auto a:res){
    for(auto b: a){
        cout<<b<<" ";
    }
    cout<<endl;
    }
    return 0;
}
