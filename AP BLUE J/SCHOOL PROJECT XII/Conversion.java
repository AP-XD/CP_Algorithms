import java.util.*;
class Conversion
{
    int Dec2Bin(int d)
    {
        if(d==0)
            return 0;
        else
            return (d%2+10*Dec2Bin(d/2));
    }

    int Bin2Dec(int b)
    {
        if(b==0)
            return 0;
        else
            return b%10+2*Bin2Dec(b/10);
    }

    public static void main(String args[])/**main() declaration*/
    {
        int d=0,r=0,k,i,ch,n2;String b="";char c;/**Variable declaration and initialization*/
        Scanner sc=new Scanner(System.in);
        Conversion ob=new Conversion();/**object creation*/
        System.out.println("Enter 1 for Dec2Bin\nEnter 2 for Bin2Dec");
        ch=sc.nextInt();/**Accepting choice from User*/
        switch(ch)
        {
            case 1:
            System.out.println("Enter Decimal number for conversion");
            d=sc.nextInt();/**Accepting Decimal number for conversion from User*/
            r=ob.Dec2Bin(d);/**function calling through object*/
            System.out.println("Converted Number:"+r);
            break;
            case 2:
            do
            {
                k=0;
                System.out.println("Enter Binary number for conversion");
                b=sc.next();/**Accepting Binary number for conversion from User*/
                for(i=0;i<b.length();i++)
                {
                    c=b.charAt(i);
                    if(c!='1' && c!='0')
                        k++;
                }
            }while(k!=0);
            n2=Integer.parseInt(b);
            r=ob.Bin2Dec(n2);/**function calling through object*/
            System.out.println("Converted Number:"+r);
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }/**end of main()*/
}/**end of Conversion*/