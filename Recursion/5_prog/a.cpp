// Find the nth fibonacci number using recursion 

#include<bits/stdc++.h>
using namespace std;

int fibo(int n){
    if(n<=1){
        return n;
    }
    int a = fibo(n-1)+fibo(n-2);
    return a;
}

int main(){
    int n;
    cout<<"Enter the number n:  "<<endl;
    cin>>n;
    cout<<fibo(n);
    return 0;
}