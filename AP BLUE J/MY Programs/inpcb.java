import java.util.*;
class inpcb{
    
    static void cube(){
        Scanner sc=new Scanner(System.in);
        int i,n,c;
        for( i=1;i<=10;i++)
        {System.out.println("Enter the number");
            n=sc.nextInt();
            c=n*n*n;   
            System.out.println("Cube of Number "+n+" :"+c);
        }
    }
}