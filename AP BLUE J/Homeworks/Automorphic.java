import java.util.*;
class Automorphic
{
  void gen(){
    Scanner sc = new Scanner(System.in);
    int u,l;
    do{
    System.out.println("Enter the upper and lower limit: "); // Inputting the number
    u = sc.nextInt();
    l = sc.nextInt();
}while((l>u)||(l<=0)||(u<=0));
    for (int i=l;i<=u;i++)
    {if(isauto(i)){
       System.out.println(i);
       }}
    }
    boolean isauto(int x){
        int c=count(x),b=0;
        b=x*x;
        if(b%(int)Math.pow(10,c)==x)
        return true;
        else
        return false;}
        int count(int x){
    int c = 0;
    while(c>0){
    c++;
    x/=10;
}return c;
}
    public static void main(String args[])
   { Automorphic ob=new Automorphic();
    ob.gen();
}}