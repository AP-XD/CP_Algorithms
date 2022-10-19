import java.util.*;
public class AntiSpiral
{
    Scanner sc=new Scanner(System.in);
    private int n;
    private int[][] a;
    public void get()
    {     
        do
        {
            System.out.print("Enter the Order of Spiral Matrix : ");
            n = sc.nextInt();
            if(n>20 || n<1)
            {
                System.out.println("\nRe Enter Order (3-20) ...\nPress Any Key To Continue");
                sc.nextLine();
            }// end of if
        }while(n>20 || n<3); // end of do-while loop
        a= new int[n][n];
        display();
    }// end of get()
    public void display()
    {

        int sp =n-1;
        int cnt=n*n;
        int r=0;
        int c=0;
        while(sp>0)
        {
            for(int i=1;i<=sp;i++)
                a[r][c++]=cnt--;           
            for(int i=1;i<=sp;i++)
                a[r++][c]=cnt--;            
            for(int i=1;i<=sp;i++)
                a[r][c--]=cnt--;
            for(int i=1;i<=sp;i++)
                a[r--][c]=cnt--;
            r++; 
            c++;
            sp-=2; 
            if(sp == 0 ) a[n/2][n/2]= 1;            
        }// end of while loop
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {                
                System.out.print(a[i][j]+(a[i][j]>9 ? "  ": "   "));
            }// end of inner for loop
            System.out.println();
        }// end of outer for loop
    }// end of display()
    public static void main(String args[])
    {
        AntiSpiral ob=new AntiSpiral();
        ob.get();
    }// end of main()
}// end of class