//Program to Find Sum of First N Natural Numbers 
 import java.util.Scanner; //Program uses Scanner class 
public class SumNatural 
 { 
     public static void main(String[] args) 
     { 
        int n,i=1,sum=0; 
        Scanner input=new Scanner(System.in); 
        System.out.print("Enter Number :"); 
        n=input.nextInt(); 
        do 
            { 
                 sum=sum+i; 
                 i =i+1; 
            }   while(i<=n); 
                 System.out.print("Sum of First " + n + " Numbers = "+sum); 
     } 
      
} 