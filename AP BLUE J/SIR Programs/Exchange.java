
import java.util.*;
public class Exchange
{
    String s,s1="";
    String a[];char ch='\u0000';
    void get()//start of method
    {
        System.out.println("Kindly enter a sentence which should end with a full stop");
        do
        {
            s = new Scanner(System.in).nextLine();
            if (check(s)==false)
                System.out.println("Invalid entry! Re-enter again.");
        }while(check(s)==false);
        insert();
        generate();
    } //end of method

    boolean check(String x)//start of method
    {
        if (x.charAt(x.length()-1)!='.')
            return false;
        for (int i=0;i<x.length()-1;i++)
        {
            if(x.charAt(i)==' ')
            {
                if(x.charAt(i+1)==' ' || x.charAt(i+1)=='.')
                    return false;
            }
        }
        return true;
    }//end of method

    void insert()//start of method
    {    s=s.substring(0,s.length()-1)+" ";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(ch==' ')
                c++;
        }
        a = new String[c];
        int c1=0; String wd="";
        for (int i = 0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if (ch!=' ' )
                wd = wd + ch;
            else
            {
                a[c1] = wd;
                c1++;
                wd = "";
            }
        }
    }//end of method

    void generate()//start of method
    {

        for (int i=0;i<a.length;i++)
        {
            String k = a[i];
            String  wd = "";
            if((i+1)%2!=0)
            {
                for (int j=0;j<k.length();j++)
                {
                    ch = k.charAt(j);
                    if ("AEIOUaeiou".indexOf(ch)>-1)
                        wd = wd + ch;
                }

            }
            else 
            {
                for (int j= k.length()-1;j>=0;j--)
                    wd = wd + k.charAt(j);

            }
            s1=s1+wd+" ";
        }
        System.out.println("Input = "+s);
        System.out.println("Output = "+s1+".");
    }//end of method
}   