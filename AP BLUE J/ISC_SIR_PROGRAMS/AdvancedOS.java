import java.io.*;
public class AdvancedOS
{
    String s1="ACEGIK";
    boolean bool;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    public void disp()throws Exception
    {
        int n;
        String sentence;
        System.out.println("Enter the length:");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter the code:");
        sentence=br.readLine();
        bool=checkLength(sentence,n);
        if(!bool)
            return;
        bool=checkChar(sentence);
        if(!bool)
            return;
        bool=checkSequence(sentence);
        if(!bool)
            return;
        bool=checkRepeat(sentence);
        if(!bool)
            return;
        System.out.println("Valid Input...");
    }//end of disp()

    private boolean checkLength(String str, int n)
    {
        boolean b=true;
        if(n!=str.length())
        {
            b=false;
            System.out.println("Invalid! String length not the same as specified");
        }//end of if 
        else if(n>6)
        {
            b=false;
            System.out.println("Error! Length of string should not exceed 6 characters!");
        }//end of else
        return b;
    }//end of checkLength()

    private boolean checkChar(String str)
    {
        int i,len;
        len=str.length();
        for (i=0;i< len;i++)
        {
            if(str.charAt(i)< 65 || str.charAt(i) >90)
                break;
        }//end of for
        if(i==len)
            return true;
        else
        {
            System.out.println("Invalid! Only upper case characters are permitted.");
            return false;
        }//end of else
    }//end of checkChar()

    private boolean checkSequence(String str)
    {
        int i,len;
        char ch;
        len=str.length();
        for (i=0;i< len;i++)
        {
            ch=str.charAt(i);
            if(s1.indexOf(ch)< 0)
                break;
        }//end of for
        if(i==len)
            return true;
        else
        {
            System.out.println("Invalid! Only alternate letters are permitted.");
            return false;
        }//end of else
    }//end of checkSequence()

    private boolean checkRepeat(String str)
    {
        int i,j,len;
        char ch;
        len=str.length();

        for (i=0;i< len-1;i++)
        {
            ch=str.charAt(i);
            for(j=i+1;j< len;j++)
            {

                if(ch==str.charAt(j))
                    break;
            }//end of inner for
            if(j!=len)
                break;
        }//end of for
        if(i==len-1)
            return true;
        else
        {
            System.out.println("Invalid! Repetition of letters is not permitted.");
            return false;
        }//end of else
    }//end of checkRepeat()

    public static void main(String args[])throws Exception
    {
        AdvancedOS ob=new AdvancedOS();
        ob.disp();
    }//end of main()

}//end of class
