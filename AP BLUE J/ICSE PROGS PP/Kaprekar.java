class Kaprekar{
public static void main(int n){
    int c=0,n1=n;
    while(n1>0)
    {c++;n1/=10;}
    int sq=n*n,s=sq/(int)Math.pow(10,c)+sq%(int)Math.pow(10,c);
    if(s==n)
    System.out.print("KAP");
    else 
    
    System.out.print("Not KAP");}}
    