#include<bits/stdc++.h>
using namespace std;

void print_subsum(int i,vector<int> vec,vector<int> v,vector<int>& res){
    int sum=0;
    if(i>=vec.size()){
        for(auto e: v){
            sum+=e;
            // cout<<e<<" ";
        }
        res.push_back(sum);
        // cout<<" The sum is: "<<sum<<endl;
        return;
    }
    v.push_back(vec[i]);
    print_subsum(i+1,vec,v,res);
    v.pop_back();
    print_subsum(i+1,vec,v,res);
}
    
int main(){
    vector<int> vec={5,2,1};
    vector<int> v={};
    vector<int> res={};
    print_subsum(0,vec,v,res);
    sort(res.begin(),res.end());
    for(auto e: res){
            cout<<e<<" ";
        }
    return 0;
}


// #include<bits/stdc++.h>
// using namespace std;

// vector<int> print_subsum(int i,vector<int> vec,vector<int> v,vector<int> res){
//     int sum=0;
//     if(i>=vec.size()){
//         for(auto e: v){
//             sum+=e;
//         }
//         res.push_back(sum);
//         return res;
//     }
//     vector<int> temp;
//     v.push_back(vec[i]);
//     temp=print_subsum(i+1,vec,v,res);
//     v.pop_back();
//     vector<int> t2=print_subsum(i+1,vec,v,res);
//     temp.insert(temp.end(),t2.begin(),t2.end());
//     return temp;
// }
    
// int main(){
//     vector<int> vec={5,2,1};
//     vector<int> v={};
//     vector<int> res={};
//     vector<int> final= print_subsum(0,vec,v,res);
//     sort(final.begin(),final.end());
//     for(auto e: final){
//             cout<<e<<" ";
//         }
//     return 0;
// }
