// Print from N to 1 using backtracking

#include<bits/stdc++.h>
using namespace std;

int i=1;
void function_e(int n,int i){
    if(i>=n)
        return;
    function_e(n,++i);
    cout<<i<<" ";
}

int main(){
    int n;
    cout<<"Enter the number n:  "<<endl;
    cin>>n;
    function_e(n,0);
    return 0;
}

