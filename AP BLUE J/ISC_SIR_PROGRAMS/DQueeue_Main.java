import java.util.*;
public class DQueeue_Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Queeue");
        int z=sc.nextInt();
        DQueeue ob=new  DQueeue(z);
        ob.menu();
    }  // end of main
}
