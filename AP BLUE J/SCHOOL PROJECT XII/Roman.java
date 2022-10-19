import java.util.*;
class Roman
{
    public static void main(String args[])/**main() declaration*/
    { 
        System.out.print("Enter a number:");
        int n= new Scanner(System.in).nextInt(),n1=n,d=0,i=0;String r="";/**Variable declaration and initialization*/
        while(n>0)
        {
            d=n%10;
            i++;
            if(i==1)
            { if (d<4) r=mag(d,'I')+r;
                if (d==4) r="IV"+r;
                if (d==5) r="V"+r;
                if (d>5 && d<9) r="V"+mag(d-5,'I')+r;
                if (d==9) r="IX"+r;
            }

            if(i==2)
            { if (d<4) r=mag(d,'X')+r;
                if (d==4) r="XL"+r;
                if (d==5) r="L"+r;
                if (d>5 && d<9) r="L"+mag(d-5,'X')+r;
                if (d==9) r="XC"+r;
            }

            if(i==3)
            { if (d<4) r=mag(d,'C')+r;
                if (d==4) r="CD"+r;
                if (d==5) r="D"+r;
                if (d>5 && d<9) r="D"+mag(d-5,'C')+r;
                if (d==9) r="CM"+r;
            }

            if(i==4)
                r=mag(d,'M')+r;
            n=n/10;
        }
        System.out.print(r+" = "+n1);/**Displaying number in roman numeral*/
    }

    /**end of main()*/
    public static String mag(int pos,char c)
    {
        String s="";int i;
        for(i=0;i<pos;i++) 
            s+=c;/**generating Roman Numerals repeated digits*/
        return s;
    }
}/**end of class Roman*/