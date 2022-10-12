#include<bits/stdc++.h>
using namespace std;
int i=0;
void recursive_function_2(){
    if(i==30)
    return;
    i++;
    cout<<i<<" ";
    recursive_function_2();
}

int main(){
    recursive_function_2();
    return 0;
}

//Output fo this will be 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 
//This time we have a base condition in the very beginning of the function
//So the function gets pushed to call stack till the base condition is reached after which they all get popped.

//So basically recursion is a function calling itself unless a base condition is met.