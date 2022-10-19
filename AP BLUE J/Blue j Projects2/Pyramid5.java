public class Pyramid5
 {

  public static void main(String[] args) {

     int x = 4;  
     for (int i = 1; i <= x; i++) 
     {  
         for (int j = 1; j <= x - i; j++)  
             System.out.print(" ");  
         for (int k = i; k >= 1; k--)  
             System.out.print( "" + k);  
         for (int k = 2; k <=i; k++)  
             System.out.print("" + k);  
         System.out.println();  
     }  
   }
 }