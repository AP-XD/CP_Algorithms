#include<bits/stdc++.h>
using namespace std;

void permutation(vector<int>& nums,vector<vector<int>>& res,int i){
    if(i==nums.size()){
        res.push_back(nums);
        return;
    }
    for(int j=i;j<nums.size();j++){
        swap(nums[i],nums[j]);
        permutation(nums,res,i+1);
        swap(nums[i],nums[j]);
    }
}

vector<vector<int>> permute(vector<int>& nums) {
    vector<vector<int>> res;
    permutation(nums,res,0);
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