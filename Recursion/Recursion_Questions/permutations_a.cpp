#include<bits/stdc++.h>
using namespace std;

void permutation(vector<int>& nums,vector<vector<int>>& res,vector<int>& v,int take[]){
    if(v.size()==nums.size()){
            res.push_back(v);
            return;
        }

    for(int i=0;i<nums.size();i++){
        if(!take[i]){
            v.push_back(nums[i]);
            take[i]=1;
            permutation(nums,res,v,take);
            take[i]=0;
            v.pop_back();
        }
    }
}

vector<vector<int>> permute(vector<int>& nums) {
    vector<vector<int>> res;
    vector<int> v;
    int take[nums.size()];
    for (int i = 0; i < nums.size(); i++) take[i] = 0;
    permutation(nums,res,v,take);
    return res;
}

int main(){
    vector<int> nums = {1,2,3};
    vector<vector<int>> res = permute(nums);
    for(auto a:res){
        for(auto b:a){
            cout<<b<<" ";
        }
        cout<<endl;
    }
    return 0;
}