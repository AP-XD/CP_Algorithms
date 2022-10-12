#include<bits/stdc++.h>
using namespace std;

void recursive_function(){
    cout<<"Hello";
    recursive_function();
}

int main(){
    recursive_function();
    return 0;
}

//Output of this will be HelloHelloHello.... till the stack overflows
//This is an infinite recursive function condition
//Coz there is no base condition and the functions keep getting added to the call stack