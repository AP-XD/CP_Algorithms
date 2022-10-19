import java.io.*;
class StdDetails
{
    public static void main()throws IOException
    {
        Marks obj = new Marks();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Name of Student: ");
        String name=br.readLine();
        System.out.print("Enter Date of Birth(DD/MM/YYYY): ");
        String d_o_b=br.readLine();
        System.out.print("Enter Roll no.: ");
        int roll=Integer.parseInt(br.readLine());
        System.out.print("Enter Total Marks(out of 500 marks): ");
        double tot=Double.parseDouble(br.readLine());
        obj.getData(name,d_o_b,roll);
        obj.display();
        obj.readData(tot);
        obj.compute();
        obj.showData();
    }
}