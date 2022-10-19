import java.util.*;
class String_op
{
    String txt;/**Instance variable declaration*/
    void read_String()
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Enter a sentence(Max. Length=100):");
            txt=sc.nextLine();/**Accepting sentence from User*/
        }while(txt.length()>100);
    }

    char case_Convert(int p)
    {
        if(p>='A' && p<='Z')
            p+=32;
        else if(p>='a' && p<='z')
            p-=32;
        return (char)p;
    }

    void circularDecode()
    {
        int ch,i;String s="";/**Variable declaration and initialization*/
        for(i=0;i<txt.length();i++)
        {
            ch=txt.charAt(i);
            ch=case_Convert(ch);/**Converting character case*/
            if((ch>=65 && ch<90) || (ch>=97 && ch<122))
                ch=ch+1;
            else if(ch==122)
                ch=97;
            else if(ch==90)
                ch=65;
            s+=(char)ch;/**forming decoded String according to the question*/
        }
        System.out.print("Decoded String:"+s);/**Displaying the circular decoded word*/
    }

    public static void main(String args[])/**main() declaration*/
    {
        String_op ob=new String_op();/**object creation*/
        ob.read_String();/**function calling through object*/
        ob.circularDecode();/**function calling through object*/
    }/**end of main()*/
}/**end of String_op*/