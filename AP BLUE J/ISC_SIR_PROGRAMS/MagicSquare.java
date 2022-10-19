 //                                                       ***** ASSIGNMENT NUMBER 8 *****
import java.util.*;
public class MagicSquare  
{ 

    public static void calc ()  
    {  System.out.print("enter no of rows ");
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt(); 
        if (N % 2 == 0)
        {
            System.out.println("no of rows must be odd");
            calc();
        }
        int[][] magic = new int[N][N]; 

        int row = N-1; 
        int col = N/2; 
        magic[row][col] = 1; 

        for (int i = 2; i <= N*N; i++) { 
            if (magic[(row + 1) % N][(col + 1) % N] == 0) { 
                row = (row + 1) % N; 
                col = (col + 1) % N; 
            } 
            else 
            { 
                row = (row - 1 + N) % N; 

            } 
            magic[row][col] = i; 
        } 

        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) { 
                if (magic[i][j] < 10)  System.out.print(" ");  //  
                if (magic[i][j] < 100) System.out.print("  ");  //  
                System.out.print(magic[i][j] + " "); 
            } 
            System.out.println(); 
        } 

    } 
}