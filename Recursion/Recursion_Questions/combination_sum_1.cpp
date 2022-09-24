#include<bits/stdc++.h>
using namespace std;

void seqfn(vector<int> vec,vector<int> v,int target,int i,vector<vector<int>> &res){
    if(i>=vec.size()){
        if(target==0){
            res.push_back(v);
        }
        return;
    }
    if(vec[i]<=target){
        v.push_back(vec[i]);
        seqfn(vec,v,target-vec[i],i,res);
        v.pop_back();
    }
    seqfn(vec,v,target,i+1,res);
}

vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
    vector<int> v;
    vector<vector<int>> result; 
    seqfn(candidates,v,target,0,result);
    return result;
}

int main(){
    vector<int> vec={2};
    int target = 1;
    vector<vector<int>> res = combinationSum(vec,target);
    for(auto a:res){
        if(a.size()==0)
        cout<<"{}";
        for(auto b:a){
            cout<<b<<" ";
        }
        cout<<endl;
    }
    return 0;
}