// Print from N to 1

#include<bits/stdc++.h>
using namespace std;
// int i;
void function_c(int n){
    int i=n;
    if(i==0)
        return;
    cout<<i<<" ";
    i--;
    function_c(i);
}

void function_c2(int n,int i){
    if(i==0)
        return;
    cout<<i<<" ";
    i--;
    function_c2(n,i);
}


int main(){
    int n;
    cout<<"Enter the number n:  "<<endl;
    cin>>n;
    function_c(n);
    function_c2(n,n);
    return 0;
}