import java.io.*;
class GT{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double CP,SP;
        System.out.println("Enter the COST Price");
        CP=Double.parseDouble(br.readLine());
        SP=CP+(0.15*CP);
        System.out.println("Selling Price:"+SP);
    }
}