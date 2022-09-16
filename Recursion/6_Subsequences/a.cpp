// Subsequence:
// a contigous/non-contigous sequence which follows the order
// Array is 1,2,3 
// Subsequences : {1} {2} {3} {1,2} {2,3} {1,3} {1,2,3} {}
//{1,3} is non-contiguous rest all contiguous


//Recursive function to print all the subsequences of an array

#include<bits/stdc++.h>
using namespace std;

vector<int> vec={1,2,3};
void print_sub(int i,vector<int> v){
    if(i>=vec.size()){
        for(auto a: v){
            cout<<a<<" ";
        }
        if(v.size()==0){
            cout<<"{}";
        }
        cout<<endl;
        return;
    }
    v.push_back(vec[i]);
    print_sub(i+1,v);
    v.pop_back();
    print_sub(i+1,v);
}

int main(){
    vector<int> v={};
    print_sub(0,v);
}