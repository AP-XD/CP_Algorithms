#include<bits/stdc++.h>
using namespace std;

void unique_sub(vector<int> vec,vector<int>& v,int i,vector<vector<int>>& count){
    if(i>=vec.size()){
        count.push_back(v);
        return;
    }
    v.push_back(vec[i]);
    unique_sub(vec,v,i+1,count);
    v.pop_back();
    unique_sub(vec,v,i+1,count);
}

int main(){
    vector<int> vec = {4,4,4,1,4};
    sort(vec.begin(),vec.end());
    vector<int> v={};
    vector<vector<int>> count;
    unique_sub(vec,v,0,count);
    map<vector<int>,int> ct;
    for(auto a: count){
        ct[a]++;
    }
    for(auto a: ct){
        if(a.first.size()==0)
        cout<<"{}";
        for(auto b: a.first){
            cout<<b<<" ";
        }
        cout<<endl;
    }
    return 0;
}