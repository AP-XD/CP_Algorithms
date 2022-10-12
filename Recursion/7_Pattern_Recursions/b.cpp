//Print 1 subsequence with sum equal to target

#include<bits/stdc++.h>
using namespace std;

bool seqsum(vector<int> vec,vector<int> v,int t,int sum,int i){
    if(i>=vec.size()){
        if(sum==t){
            for(auto e:v){
                cout<<e<<" ";
            }
            cout<<endl;
            return true;
        }
        return false;
    }
    v.push_back(vec[i]);
    sum+=vec[i];
    if(seqsum(vec,v,t,sum,i+1)==true)
    return true;
    v.pop_back();
    sum-=vec[i];
    if(seqsum(vec,v,t,sum,i+1)==true)
    return true;

    return false;
}

int main(){
    vector<int> vec = {1,2,3,4,5};
    vector<int> v;
    int target=5,sum=0;
    seqsum(vec,v,target,sum,0);
    return 0;
}

//This case you just have to print one recursion call
//so what we do is return true if base condition satisfied and false otherwise
//and add a condition to check and return true for all recursion calls
//if not true return false