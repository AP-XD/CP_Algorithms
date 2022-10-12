//Count the number of subsequence with sum equal to target

#include<bits/stdc++.h>
using namespace std;

int countseq(vector<int> vec,int t,int sum,int i){
    if(i>=vec.size()){
        if(sum==t){
            return 1;
        }
        return 0;
    }
    sum+=vec[i];
    int a=countseq(vec,t,sum,i+1);
    sum-=vec[i];
    int b=countseq(vec,t,sum,i+1);
    return a+b;
}


int main(){
    vector<int> vec = {1,2,3,4,5};
    int target=5,sum=0;
    cout<<countseq(vec,target,sum,0);
    return 0;
}

//This case you just have to print number of subsequence
//so what we do is return 1 if base condition satisfied and 0 otherwise
//store the value returned for all recursion calls .... 2 variables for 2 recursion calls and so on
//finally return the sum of all variables