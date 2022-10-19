import java.io.*;
class Lapindrome{
    String str;
    public void input() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter word");
        str=br.readLine();
        int l=str.length();
        if((l%2)==0)
            even(l);
        else
            odd(l);
    }

    public void even(int a)
    {
        String s=str.substring(0,(a/2));
        String sp=str.substring((a/2),a);
        int c=0,c1=0;
        outer:
        for(int i=0;i<s.length();i++)
        { c1=0;
            char x=s.charAt(i);
            int k=freq(s,x);
            for(int j=0;j<sp.length();j++)
            {
                char y=sp.charAt(j);
                if(x==y)
                {   c1++; 
                    int m=freq(sp,y);
                    if(k==m)
                        c=1;
                    else{c=0;
                        break outer;
                    }}
            }
            if(c1==0)
                break;
        }
        if((c==1)&&(c>0))
            System.out.println("Lapindrome string");
        else
            System.out.println("Not Lapindrome string");
    }

    public void odd(int a)
    {  int b=a/2;
        String s=str.substring(0,b);
        String sp=str.substring((b+1),a);
        int c=0,c1=0;
        outer:
        for(int i=0;i<s.length();i++)
        { c1=0;
            char x=s.charAt(i);
            int k=freq(s,x);
            for(int j=0;j<sp.length();j++)
            {
                char y=sp.charAt(j);
                if(x==y)
                {   c1++;
                    int m=freq(sp,y);
                    if(k==m)
                        c=1;
                    else{c=0;
                        break outer;
                    }
                }
            }
            if(c1==0)
                break;
        }
        if((c==1)&&(c1>0))
            System.out.println("Lapindrome string");
        else
            System.out.println("Not Lapindrome string");    
    }

    public int freq(String a,char b)
    { 
        int s=0;
        for(int i=0;i<a.length();i++)
        {
            char z=a.charAt(i);
            if(z==b)
                s++;
        }
        return s;
    }

    public static void main(String args[]) throws IOException
    {
        Lapindrome ob=new Lapindrome();
        ob.input();
    }
}

    


