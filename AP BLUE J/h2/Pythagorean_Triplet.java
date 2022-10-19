import java.util.*;
class Pythagorean_Triplet{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for(int x=1;x<=n;x++){int y=1; 
            for(int j=1;j<=1000;j++){
                       
            double z=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            if(z%(int)z==0)
            System.out.println("x="+x+"  "+"y="+y+"    "+"z="+z);
           y++;
        }
    }}}
            
            
            
            
            