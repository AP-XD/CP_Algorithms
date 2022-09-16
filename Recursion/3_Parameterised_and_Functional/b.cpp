//Sum of First Numbers using functional recursion

// sum(5)=sum(4)+5
// sum(4)=sum(3)+4 and so on

#include<bits/stdc++.h>
using namespace std;

int sum=0;
int sum_b(int n){
   if(n==1){
        sum+=1;
   }
   else{
        sum+=n;
        n--;
        sum_b(n);
   }
   return sum;
}

int main(){
    int n,i=1;
    cout<<"Enter the number n:  "<<endl;
    cin>>n;
    cout<<sum_b(n);
    return 0;
}