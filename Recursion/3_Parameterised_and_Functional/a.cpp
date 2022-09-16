//Sum of First Numbers using paramterized recursion

#include<bits/stdc++.h>
using namespace std;

int sum=0;
int sum_a(int n,int i){
    if(i>n)
        return 0;
    
    sum+=i;
    sum_a(n,++i);
    return sum;
}

int sum2(int n,int sum){
    if(n==0)
        return sum;

    sum+=n;
    sum2(--n,sum);
    // cout<<" "<<sum<<" ";
}

int main(){
    int n,i=1;
    cout<<"Enter the number n:  "<<endl;
    cin>>n;
    cout<<sum_a(n,i);
    cout<<sum2(n,0);
    return 0;
}

//n=4
//sum_a(4,1) pushed sum=>1
//sum_a(4,2) pushed sum=>1+2=3
//sum_a(4,3) pushed sum=>3+3=6
//sum_a(4,4) pushed sum=>6+4=10