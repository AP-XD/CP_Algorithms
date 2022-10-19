 

import java.util.*;
class Consec_num_sum
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),i,j,k,s=0,flag=0;/**Variable declaration and initialization*/
        for(i=1;i<=n/2+1;i++)
        {
            for(j=i;j<=n/2+1;j++)
            {
                s+=j;/**Calculating sum of consecutive numbers*/
                if(s==n)/**Checking if sum of consecutive numbers is equal to n or not*/
                {
                    for(k=i;k<=j;k++)
                    {
                        flag=1;
                        System.out.print(k+"\t");
                    }
                    System.out.println();/**Moving cursor to next line*/
                    continue;
                }
            }
            s=0;/**Reinitializing s to 0*/
        }
        if(flag==0)/**Checking if there is any such consecutive number combination or not*/
        System.out.println("No such number combinations are there");
    }/**end of main()*/
}/**end of Consec_num_sum*/     