import java.io.*;
class Menu_Palin_Count
{   
    char c;/**class variable declaration and initialization*/
    int i,t=0;;
    static String s="",s2="",s3="";
    void Palin()/**Palin() definition*/
    {  
        System.out.print("Palindrome words:");
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);/**extraction of each character*/
            if(c==' ')
            {
                if(s3.equalsIgnoreCase(s2))/**checking strings are same or not*/
                {
                    System.out.print(s2+" ");
                    t++;
                }
                s3="";
                s2="";
            }
            else 
            {
                s3=c+s3;/**backward concatenation*/
                s2+=c;/**forward concatenation*/
            }
        }
        System.out.print("\nTotal:"+t);
    }

    void count()/**count() definition*/
    {    
        char c1,c2;/**variable declaration and initialization*/        
        System.out.print("The words are: ");
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                c1=s2.charAt(0);
                c2=s2.charAt(s2.length()-1);
                if(s3.indexOf(c1)>=0 && s3.indexOf(c2)>=0)
                {
                    System.out.print(s2+" ");
                    t++;/**counter value increment by 1*/
                }
                s2="";
            }
            else
                s2+=c;/**forward concatenation*/
        }
        System.out.print("\tTotal:"+t);
    }

    public static void main(String args[])throws IOException/**main function definition*/
    {   
        Menu_Palin_Count ob=new Menu_Palin_Count();/**object creation*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));/**object creation*/
        System.out.println("Enter a choice\n1 for Palindrome word check\n2 for displaying words starting and ending in vowel");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)/**starting of switch block*/
        {
            case 1:
            System.out.println("Enter a sentence");
            s=br.readLine();  
            s+=' ';
            ob.Palin();/**function calling through object*/
            break;
            case 2: 
            System.out.println("Enter a sentence");
            s=br.readLine();  
            s+=' ';
            s3="AEIOUaeiou";
            ob.count();/**function calling through object*/
            break;
            default:
            System.out.println("Wrong choice");
        }/**end of switch block*/
    }/**end of main method*/
}/**end of class Menu_Palin_Count*/