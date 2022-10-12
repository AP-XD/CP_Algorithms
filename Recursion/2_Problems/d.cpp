// Print from 1 to N using backtracking

#include<bits/stdc++.h>
using namespace std;

void function_d(int n,int i){
    if(i<1)
        return;
    function_d(n,i-1);
    cout<<i<<" ";
}

int main(){
    int n;
    cout<<"Enter the number n:  "<<endl;
    cin>>n;
    function_d(n,n);
    return 0;
}

// Function call gets added stack n times
//No printing yet
//In the n+1th time base condition is true so returned
//so the top most value in the call stack is continued
// which goes on to print a value 
// and from there all the values get printed while the function comes in top of stack