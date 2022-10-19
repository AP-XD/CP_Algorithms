import java.util.*;
class Word
{
    public static void main(String args[])/**main() declaration*/
    {
        String s,w="",r="",s2="",minw="";char c;int i,min,k=0;/**Variable declaration and initialization*/
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter a Sentence ending with full stop(.)");
            s=sc.nextLine();/**Accepting sentence end with(.) from User*/
        }while(s.charAt(s.length()-1)!='.');
        s=s.substring(0,s.length()-1)+' ';
        min=s.length();
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                if(min>k)
                {
                    min=k;
                    k=0;
                }
            }
            else
                k++;
        }
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                s2+=r+" ";/**After reverse each word at its position*/
                /**Finding the smallest word*/
                if(min==w.length())
                {
                    minw+=w+" ";
                }
                r="";
                w="";
            }
            else
            {
                w+=c;/**Forward concatenation*/
                r=c+r;/**Backward concatenation*/
            }
        }
        System.out.println("Smallest Word:"+minw+"\nAfter reverse each word at its position:"+s2.trim()+'.');
    }/**end of main()*/
}/**end of Word*/