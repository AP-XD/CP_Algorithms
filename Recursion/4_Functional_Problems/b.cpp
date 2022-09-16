// Check if a string is paindrome using recursion

#include<bits/stdc++.h>
using namespace std;

bool checkPalindrome(string str,int i,int j){
    if(str[i]!=str[j])
        return false;
    checkPalindrome(str,++i,--j);
    return true;
}

int main(){
    string str;
    cout<<"Enter the String:    ";
    cin>>str;
    if(checkPalindrome(str,0,str.length()-1)==true)
    cout<<"Palindrome";
    else
    cout<<"Not Palindrome";
    return 0;
}