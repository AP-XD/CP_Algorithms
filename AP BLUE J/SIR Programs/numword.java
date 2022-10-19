import java.util.*;
class numword {
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
 int i,n,n1,len,num=0;
 int a[]=new int[4];
 String word[]={"ONE","TWO", "THREE", "FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIxTEEN","SEVENTEEN","EIGHTTEEN","NINETEEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY","HUNDRED","THOUSAND"};
 System.out.println("enter the number less than 10000");
 n=s.nextInt();
 n1=n; i=4;len=0;
 while(n1> 0)
 {
     a[--i]=n1%10;
     n1/=10;
    }
    while(i!=0)
    {
        a[--i]=0;
    }
    if(a[0]!=0)
    {
        System.out.print(word[a[0]-1]+" "+word[28]+" ");
    }
    if(a[1]!=0)
    {
        System.out.print(word[a[1]-1]+" "+word[27]+" ");
    }
    if(a[2]!=0)
    {
        if(a[2] >= 2)
        {
            System.out.print(word[a[2]+17]+" ");
            if(a[3]!=0)
            System.out.print(word[a[3]-1]+" ");
        }
        if(a[2]==1)
        {
            System.out.print(word[a[3]+9]);
        }
    }
    else
    if(a[2]==0 && a[3]!=0)
    System.out.print(word[a[3]-1]);
}
}