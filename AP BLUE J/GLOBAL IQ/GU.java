import java.io.*;
class GU{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int B;
        double DA,TA,G,T,N;
        System.out.println("Enter the Basic Salary");
        B=Integer.parseInt(br.readLine());
        DA=.5*B;
        TA=.4*B;
        G=DA+TA+B;
        T=.18*G;
        N=G-T;
        System.out.println("DA:"+DA);
        System.out.println("TA:"+TA);
        System.out.println("GROSS SALARY:"+G);
        System.out.println("TAX:"+T);
        System.out.println("NET SALARY:"+N);
    }
}