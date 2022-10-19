import java.util.*;
class consec{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int b[]=new int[5],i,t,j;
        for(i=0;i<5;i++){

            System.out.println("Enter numbers");
            b[i]=sc.nextInt();
        }
        for(i=0;i<4;i++)
        {
           
                if(b[i+1]==b[i]+1)
                    System.out.println(b[i]+"\t"+b[i+1]);
            }
    }}