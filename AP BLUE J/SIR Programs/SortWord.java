
import java.util.*;
class SortWord
{ int count(String a)
    { int k=0;
        for(int i=0;i<a.length();i++)
        { char b=a.charAt(i);
            b=Character.toUpperCase(b);
            if(b=='A' || b=='E' || b=='I' || b=='O' || b=='U' )
                ++k;
        }
        return k;
    }

    boolean chk(String a,String b)
    { for(int i=0;i<Math.min(a.length(),b.length());i++)
        { if(a.charAt(i)<b.charAt(i))
                return true;
        }
        return false;
    }

    void sortinDesc()
    { Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String a=sc.nextLine();
        a=a.trim();
        a=a+" ";
        String d="";
        int k=0;
        for(int i=0;i<a.length();i++)
        { if(a.charAt(i)==' ')
                k++;
        }
        String w[]=new String[k];k=0;
        for(int i=0;i<a.length();i++)
        { if(a.charAt(i)!=' ')
                d=d+Character.toString(a.charAt(i));
            else  
            {w[k++]=d;
                d="";
            }
        }
        for(int i=0;i<w.length-1;i++)
            for(int j=0;j<w.length-1;j++)
            { String t="";
                if(count(w[j])<count(w[j+1])) 
                {t=w[j];
                    w[j]=w[j+1];
                    w[j+1]=t;
                }
                if(count(w[j])==count(w[j+1]))
                    if(chk(w[j],w[j+1]))
                    {t=w[j];
                        w[j]=w[j+1];
                        w[j+1]=t;
                    }
            }
        for(int i=0;i<w.length;i++)  
            System.out.print(w[i]+" ");
    }

    public static void main(String args[])
    { SortWord ob=new SortWord();
        ob.sortinDesc();
    }
}