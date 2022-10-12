//Print Name n times

#include<bits/stdc++.h>
using namespace std;

void function_a(int n,int i){
    if(i>n)
        return;
    i++;
    cout<<"Kathiresan"<<endl;
    function_a(n,i);
}

int main(){
    int n,i=1;
    cout<<"Enter the number n:  "<<endl;
    cin>>n;
    function_a(n,i);
    return 0;
}

//function_a(5,1) pushed
//function_a(5,2) pushed
//function_a(5,3) pushed
//function_a(5,4) pushed
//function_a(5,5) pushed
//function_a(5,6) doesnt satisfy base condition so return
//function_a(5,5) popped
//rest calls in stack popped too