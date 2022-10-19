import java.util.*;
class Pythagorean_Triplet
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of N");
        int n=sc.nextInt(),i,j,k;/**Variable declaration and initialization*/
        System.out.println("Pythagorean Triplets upto "+n+" are:");
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                for(k=j;k<=n;k++)
                {
                    if(((i*i)+(j*j))==(k*k))
                        System.out.print(i+","+j+","+k+"    ");/**Displaying the Pythagorean Triplets*/
                }
            }
        }
    }/**end of main()*/
}/**end of Pythagorean_Triplet*/