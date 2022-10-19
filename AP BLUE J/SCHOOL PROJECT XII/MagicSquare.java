import java.util.*;
public class MagicSquare  
{ 
    public static void main (String args[])/**main() declaration*/
    {          
        Scanner sc= new Scanner(System.in);
        int n;char ch;
        do
        {
            System.out.print("Enter ORDER of Matrix:");
            n=sc.nextInt();/**Accepting ORDER from user*/
            ch='n';
            if(n%2==0 || n>13 || n<0)
            {
                System.out.println("INVALID ORDER\nDO you want to enter again?(Y/N)");
                ch=sc.next().charAt(0);
            }
        }while(ch=='Y' || ch=='y');/**valid ORDER condition checking*/
        int m[][]=new int[n][n],r=0,c=n/2,i,j,s=0;; 
        m[r][c]=1;
        for (i = 2; i <= n*n; i++) { 
            if (m[(r+n-1)%n][(c + 1)%n]==0)
            { 
                r=(r+n-1)%n; 
                c=(c+1)%n; 
            } 
            else 
                r=(r+1)%n; 
            m[r][c]=i; 
        } 
        System.out.println(n+"X"+n+" ORDER Magic Square:");
        for (i = 0; i < n; i++) { 
            s+=m[i][0];
            for (j = 0; j < n; j++) { 
                if (m[i][j]<10)  System.out.print(" ");  
                if (m[i][j]<100) System.out.print("  "); 
                else System.out.print("   ");  
                System.out.print(m[i][j]+" ");/**Displaying the output*/
            } 
            System.out.println(); 
        }
        System.out.println("Row wise sum="+s+"\nColumn wise sum="+s+"\nDiagonal sum="+s);/**Displaying the output*/
    }/**end of main()*/
}/**end of MagicSquare*/