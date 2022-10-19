class numberproblems{
    
   
int sumoffactors(int n){
   int i,s=0;
    for(i=1;i<n;i++){
    if(n%i==0)
    s+=i;}
   return s;
}
boolean isperfect(int v){
   
   
    int y=sumoffactors(v);
    if(y==v)
    return true;
    else
    return false;
}
void allperfect(int x){
    
    for(int i=1;i<=x;i++){
        if(isperfect(i))
        System.out.print(i+ "  ");
    }}}
        
    
