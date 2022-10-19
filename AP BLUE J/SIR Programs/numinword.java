import java.util.*;
class numinword 
{ private String num[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
    "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Ten",
    "Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety","Crore","Lakh","Thousand","Hundred",""};
     String wor=""; long c[] =new long[10];;
  public static void main(String args[])
    {  Scanner sc=new Scanner(System.in);
        numinword ob=new numinword();
        long n;
        do{System.out.print("Enter a  Number within 0 to 10000000: ");
          n=sc.nextLong();
      }while(n<=0);
      ob.convert(n);      
   }
   void convert(long n)
   { 
     long a=n;int b=9;
     while(a>0)
     {c[b]=a %10;
       if(b==6)
         {c[b]=0;--b;;continue;}
         a/=10;--b;
        }
     for(int i=0;i<c.length;i+=2)
     { if(c[i]==0 && c[i+1]==0)
         continue;
         else
         conv1(i);
        }
    }
    void conv1(int a)
    { 
        if (c[a]==0)
        System.out.print(num[(int)c[a+1]-1]+" "+num[27+a/2]+" ");
      else if(c[a+1]==0)
        System.out.print(num[17+(int)c[a]]+" "+num[27+a/2]+" ");
      else if(c[a]==1)
       System.out.print(num[8+(int)c[a+1]]+" "+num[27+a/2]+" ");
      else if(c[a]!=0 && c[a+1]!=0)
       System.out.print(num[17+(int)c[a]]+" "+num[(int)c[a+1]-1]+" "+num[27+a/2]+" ");
    }
}