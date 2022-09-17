//Print all subsequences with sum equal to target

#include<bits/stdc++.h>
using namespace std;

void seqsum(vector<int> vec,vector<int> v,int t,int sum,int i){
    if(i>=vec.size()){
        if(sum==t){
            for(auto e:v){
                cout<<e<<" ";
            }
            cout<<endl;
        }
        return;
    }
    v.push_back(vec[i]);
    sum+=vec[i];
    seqsum(vec,v,t,sum,i+1);
    v.pop_back();
    sum-=vec[i];
    seqsum(vec,v,t,sum,i+1);
}

int main(){
    vector<int> vec = {1,2,3,4,5};
    vector<int> v;
    int target=5,sum=0;
    seqsum(vec,v,target,sum,0);
    return 0;
}