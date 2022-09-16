// find the reverse of a vector using recursion

#include<bits/stdc++.h>
using namespace std;

vector<int> reverse_fn(vector<int> &v,int i,int n){
    if(i>n){
        return v;
    }
    // swap(v[i],v[n]);
    int temp=v[i];
    v[i]=v[n];
    v[n]=temp;
    reverse_fn(v,++i,--n);
    return v;
}

int main(){
    vector<int> v={1,2,3,4,5};
    int n=v.size();
    vector<int> VV=reverse_fn(v,0,n-1);
    for(auto a: VV){
        cout<<a<<" ";
    }
    return 0;
}

//we can either use refernce with & as we see in line 6
// or we can store the reverse of line 11 in v and return v
// or we can directly return the line 11