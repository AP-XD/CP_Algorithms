import java.util.*;


class twp
{
    public static int primeCheck(int x)
    {
     
     for(int i=2;i<x;i++)
      {
       if(x%i==0) return 0;  
      }
      return 1;
    }

    public static void  main(String args[])
    {
    while(true){
     Scanner sc = new Scanner(System.in);
     
     int a = sc.nextInt();
     int b = sc.nextInt();
     
     while(a<0 || b<0){
        a = sc.nextInt();
        b = sc.nextInt();
        }
     int resultA= primeCheck(a);
     
     if(resultA==1 && Math.abs(a-b)==2)
          System.out.println("Twin Prime found");
          
     else 
       System.out.println("Not Twin Prime");
     
    }
}
}