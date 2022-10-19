import java.util.*;
class Keith_no
{
    static boolean isKeith(int n)
    {
        int cp=n,s=0,c=(int)(Math.log10(n))+1,i=c-1,a[]=new int [c];
        while(n>0){
            a[i--]=n%10;
            n/=10;}
        while(s<cp)
        {s=0;
          for(i=0;i<a.length;i++)
          {
              s+=a[i];
              if(i!=c-1)
              a[i]=a[i+1];
          }
          a[i-1]=s;
        }
        if(s==cp)
        return true;
        else return false;
    }
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int l,u;
        do{
            System.out.println("Enter lower and upper limit respectively");
            l=sc.nextInt();
            u=sc.nextInt();
        }while(l>=u || u<0 || l<0);
        for(int i=l;i<=u;i++)
        {
            if(isKeith(i))
            System.out.println(i+"  ");
        }
    }
}        