import java.util.*;
class Happy
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
    {if(isHappy(i)){
       System.out.println(i);
       }}
    }
    boolean isHappy(int x)
        {
        while(x>9){
        x=sumsq(x);}
       
        if(x==1)
        return true;
        else
        return false;}
      
        int sumsq(int x)
{int s=0;
    while (x>0)
    {int b=x%10;
        s=s+(b*b);
        x/=10;
    }return s;
    }
    public static void main(String args[])
   { Happy ob=new Happy();
    ob.gen();
}}
    