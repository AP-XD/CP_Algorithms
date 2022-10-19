import java.util.*;
public class Sort
{
    String str;
    int l;
    Sort()
    {
        str="";
        l=0;
    }
    void readword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        str = sc.next();
        l=str.length();
    }
    void arrange()
    {
        char ch;
        char a[]=new char[l],t;
        int i,j,k;
        for(i=0;i<l;i++)
        {
            a[i]=str.charAt(i);
        }
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<l-i;j++)
            {
                if((int)a[j+1]<(int)a[j])
                {
                    t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    void display()
    {
        String st="";
        for(int i=0;i<l;i++)
        {
            st+=a[i];
        }
        System.out.println(str);
        System.out.println(st);
    }
}
