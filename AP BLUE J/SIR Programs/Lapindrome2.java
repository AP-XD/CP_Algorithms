//another
//LAPINDROME
import java.util.Scanner;
class Lapindrome2
{
    private String n;
    private int aa[];
    private int bb[];
    void input()
    {
        System.out.println("enter a word");
        n=new Scanner(System.in).next();
    }

    boolean check()
    {
        aa=new int[26];
        bb=new int[26];
        n=n.toUpperCase();
        int i=0;
        String a="";
        String b="";
        if(n.length()%2==0)
        {
            a=n.substring(0,n.length()/2);
            b=n.substring(n.length()/2,n.length());
        }
        else
        {
            int m=(n.length()+1)/2;
            a=n.substring(0,m-1);
            b=n.substring(m,n.length());
        }
        if(a.length()!=b.length())
            return false;
        for(i=0;i<a.length();i++)
        {
            for(int j=65;j<=90;j++)
            {
                if(a.charAt(i)==(char)j)
                    aa[j-65]=++aa[j-65];
            }
        }
        for(i=0;i<b.length();i++)
        {
            for(int j=65;j<=90;j++)
            {
                if(b.charAt(i)==(char)j)
                    bb[j-65]=++bb[j-65];
            }
        }
        for( i=0;i<26;i++)
        {
            if(aa[i]!=bb[i])
                return false;
        }
        return true;
    }

    void display()
    {
        input();
        if(check())
            System.out.println("Lapindrome");
        else
            System.out.println("Not Lapindrome");
    }

    public static void main(String args[])
    {
        new Lapindrome2().display();
    }
}