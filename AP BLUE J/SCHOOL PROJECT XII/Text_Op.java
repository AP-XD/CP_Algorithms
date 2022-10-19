import java.util.*;
class Text_Op
{
    public static void main(String args[])/**main() declaration*/
    {                 
        Scanner sc=new Scanner(System.in);
        char c;StringTokenizer stk;String s1[]=new String [10],s;int i,j,k=0,x=0,y=0,max=0;/**Variable declaration and initialization*/
        do
        {
            if(k>5)
                System.out.println("Sentence limit exceeded");
            k=0;
            System.out.println("Enter the paragraph containing maximum of 5 sentences terminated by(.,!?):");
            s=sc.nextLine();/**Accepting sentence from User*/
            for(i=0;i<s.length();i++)
            {
                c=s.charAt(i);
                if(".,!?".indexOf(c)>=0)
                    k++;/**Counting number of sentences*/
            }
        }while(k>5);
        String v[]=new String [s.length()];/**Variable declaration and initialization*/       
        stk=new StringTokenizer(s,"!?.,",true);
        StringBuffer k2=new StringBuffer();
        while(stk.hasMoreTokens())
        {
            s1[x++]=stk.nextToken();/**Separating sentences from paragraph and storing them in an array*/
        }
        System.out.print("Longest Words:");
        for(i=0;i<x;i++)
        {            
            stk=new StringTokenizer(s1[i]," ");
            y=0;
            while(stk.hasMoreTokens())
            {
                s=v[y++]=stk.nextToken();/**Separating words from sentences and storing them in an array*/
            }
            max=0;
            for(j=0;j<y;j++)
            {
                    if(max<v[j].length())
                        max=v[j].length();
            }
            for(j=0;j<y;j++)
            {                
                    if(v[j].length()==max && ".,!? ".indexOf(v[j])==-1)
                        System.out.print(v[j]+" ");
            }
        }
        System.out.println("\nReverse words of each sentence at its position with punctuators:");
        for(i=0;i<x;i++)
        {            
            stk=new StringTokenizer(s1[i]," ");
            y=0;
            while(stk.hasMoreTokens())
            {
                s=v[y++]=stk.nextToken();/**Separating words from sentences and storing them in an array*/
                k2.replace(0,k2.length(),s);
                if(".,!?".indexOf(s.charAt(0))>=0 || (y==1 && i==0))
                    System.out.print(k2.reverse());
                else
                    System.out.print(" "+k2.reverse());
            }
        }
    }/**end of main()*/
}/**end of Text_Op*/