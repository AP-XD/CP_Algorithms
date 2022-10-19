import java.util.*;
class word2
{
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        String x="";
        int c=0;
        System.out.print("Enter the first string: ");
        do
        {
            if(c!=0)
                System.out.println("Come Agaim");
            c++;
            x=sc.next();
        }while(x.length()>30);
        x=x.toUpperCase();
        newword(x);
    }

    public void newword(String c)
    {
        String d=" ";
        int flag=0;
        for(int i=0;i<c.length();i++)
        {
            for(int j=0;j<d.length();j++)
            {
                if(c.charAt(i)==d.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                d+=c.charAt(i);              
            }
            flag=0;
        } 
        d=d.trim();
        char a1=(char)((int)d.charAt(d.length()-1)+1);
        System.out.print(d);
        for(char i=a1;i<='Z';i++)
        {
            System.out.print(i);
        }
    }
}


