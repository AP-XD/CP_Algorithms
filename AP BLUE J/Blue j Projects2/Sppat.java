import java.util.Scanner;
 
public class Sppat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        //Taking noOfRows value from the user
 
        System.out.println("How Many Rows You Want In Your Pyramid?");
 
        int n = sc.nextInt();
 
        //Initializing rowCount with 1
 
        int r = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
        for (int i = n; i > 0; i--)
        {
            //Printing i*2 spaces at the beginning of each row
 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j value where j value will be from 1 to rowCount
 
            for (int j = 4; j>= r; j--)             
            {
                System.out.print(j+" ");
            }
 
            //Printing j value where j value will be from rowCount-1 to 1
             
            for (int j = r-1; j <= 4; j++)
            {                 
                System.out.print(j+" ");             
            }                          
             
            System.out.println();
 
            //Incrementing the rowCount
 
            r++;
        }
    }
}