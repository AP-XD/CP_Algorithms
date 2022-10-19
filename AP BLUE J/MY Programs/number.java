class number{
    
   
int sumofdigitcube(int n){
   int i,s=0,d;
   while(n>0){
       d=n%10;
       s+=d*d*d;
       n/=10;
    }
   return s;
}
boolean isarmstrong(int n){
   
   
    int y=sumofdigitcube(n);
    if(y==n)
    return true;
    else
    return false;
}
void allarmstrong(int n){
    
    for(int i=1;i<=n;i++){
        if(isarmstrong(i))
        System.out.print(i+ "  ");
    }}}
        
    
