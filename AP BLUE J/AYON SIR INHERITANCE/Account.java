import java.io.*;
public class Account
{
    public static String name,ac_type,acno,acc="";
    public static void getdata()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
        System.out.print("Enter the name: ");
        name=br.readLine();
        System.out.print("Enter the Account Type: Current/Savings ::");
        ac_type=br.readLine();
        if((ac_type.equals("Current"))==true)
            acno="C";
        else
            acno="S";
        System.out.print("Enter the Account Number: ");
        acc=br.readLine();
        acno=acno+acc;
    }
}
