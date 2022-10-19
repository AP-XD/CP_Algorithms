import java.util.*;
class Decoder
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        String w2,w="",t="";int i,ch,f=0;/**Variable declaration and initialization*/
        System.out.println("Enter the coded text:");
        w2=sc.next().trim();/**Accepting sentence from user*/
        do/**to form the words from the coded text*/
        {
            if(w2.length()<3)
                ch=Integer.parseInt(w2.substring(0,2));
            else
                ch=Integer.parseInt(w2.substring(0,3));
            if((ch)<=122 && (ch)>=97)
            {
                w=w+(char)(ch);
                w2=w2.substring(3);
            }
            else
            {
                ch=Integer.parseInt(w2.substring(0,2));
                if(ch<=90 && ch>=65 || ch==32)

                    w=w+(char)(ch);
                w2=w2.substring(2);
            }
        }while(w2.length()>=2);
        w=w.trim();
        for(i=0;i<w.length();i++)/**to remove extra space and capitalize letters according to program logic*/
        {
            if(w.charAt(i)==' ' && f==1)
            {
                t+=w.charAt(i);f=0;
            }
            else if(w.charAt(i)!=' '&& f==0)
            {
                t+=Character.toUpperCase(w.charAt(i));
                f=1;}
            else if(w.charAt(i)!=' ')
            {
                f=1;t+=Character.toLowerCase(w.charAt(i));
            }
        }
        System.out.println("Coded value="+t);/**Displaying the output*/
    }/**end of main()*/
}/**end of Decoder*/