import java.util.*;
class Sentence_Op
{
    static void removedup(String words[])
    {
        int i,j;/**Variable declaration and initialization*/
        for(i=0;i<words.length;i++)     
        {
            if(words[i]!=null)
            {
                for(j=i+1;j<words.length;j++)   
                {
                    if(words[i].equals(words[j]))   /**Checking for both strings are equal*/
                    {
                        words[j]=null;              /**Delete the duplicate words*/
                    }
                }
            }
        }
    }

    public static void main(String args[])/**main() declaration*/
    {                 
        Scanner sc=new Scanner(System.in);
        char c;StringTokenizer stk;String s1[]=new String [10],s,t;int i,j,k=0,x=0,y=0,z=0;/**Variable declaration and initialization*/
        do
        {
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
        String v[]=new String[s.length()],s2[]=new String [s.length()];/**Variable declaration and initialization*/       
        stk=new StringTokenizer(s,"!?.,",true);
        while(stk.hasMoreTokens())
        {
            s1[x++]=stk.nextToken();/**Separating sentences from paragraph and storing them in an array*/
        }
        for(i=0;i<x;i++)
        {
            s=s1[i];
            stk=new StringTokenizer(s," ");
            y=0;
            while(stk.hasMoreTokens())
            {
                s2[y++]=stk.nextToken();/**Separating words from sentences and storing them in an array*/
            }
            for(j=0;j<y-1;j++)
            {
                for(k=j+1;k<y;k++)
                {
                    if(s2[j].compareTo(s2[k])>0)
                    {
                        t=s2[j];
                        s2[j]=s2[k];/**sorting alphabetically*/
                        s2[k]=t;
                    }
                }
            }
            for(j=0;j<y;j++)
            {
                v[z++]=s2[j];
                if(".,!? ".indexOf(s2[j].charAt(0))>=0 || z==1)
                    System.out.print(s2[j]);/**Displaying output according to condition*/
                else
                    System.out.print(" "+s2[j]);/**Displaying output according to condition*/
            }
        }
        removedup(v);/**Removing duplicate words*/
        System.out.println("\nVowels:");
        for(j=0;j<z;j++)
        {
            if(v[j]!=null)
            {
                c=v[j].charAt(0);
                if("AEIOUaeiou".indexOf(c)>=0)/**checking whether the extracted character is a vowel or not*/
                    System.out.print(v[j]+" ");/**Displaying the words beginning vowels Sentence wise*/
            }
        }
    }/**end of main()*/
}/**end of Sentence_Op*/