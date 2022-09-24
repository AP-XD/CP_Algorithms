#include<bits/stdc++.h>
using namespace std;

void unique_sub(vector<int> vec,vector<int>& v,int i,set<vector<int>>& res){
    if(i>=vec.size()){
        res.insert(v);
        return;
    }
    v.push_back(vec[i]);
    unique_sub(vec,v,i+1,res);
    v.pop_back();
    unique_sub(vec,v,i+1,res);
}

vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<int> v = {};
        vector<vector<int>> ans;
        set<vector<int>> res;
        unique_sub(nums,v,0,res);
        for(auto a : res){
            ans.push_back(a);
        }
        return ans;
}

int main(){
    vector<int> vec = {1,2,2};
    sort(vec.begin(),vec.end());
    vector<vector<int>> result = subsetsWithDup(vec);
      for(auto a : result){
        if(a.size()==0){
            cout<<"{}";
        }
            for(auto b:a){
                cout<<b<<" ";
            }
            cout<<endl;
      }
    return 0;
}