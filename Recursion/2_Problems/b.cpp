// Print Linearly from 1 to N

#include<bits/stdc++.h>
using namespace std;

// int i=1;
void function_b(int n,int i){
    if(i>n)
        return;

    cout<<i<<" ";
    i++;
    function_b(n,i);
}

int main(){
    int i=1;
    int n;
    cout<<"Enter the number n:  "<<endl;
    cin>>n;
    function_b(n,i);
    return 0;
}