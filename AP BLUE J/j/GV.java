import java.io.*;
class GV{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int h,m,s,ts;
        System.out.println("Enter no. of hours, minute and second respectively");
        h=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        s=Integer.parseInt(br.readLine());
        ts=s+(60*m)+(3600*h);
        System.out.println("Total no. of seconds:"+ts);
    }
}