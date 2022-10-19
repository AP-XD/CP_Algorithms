import java.util.*;
class Fermat_last_theorem2{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for(int x=1;x<=n;x++){int y=1; 
            for(int j=1;j<=10000;j++){
                       
            double z=Math.cbrt(Math.pow(x,3)+Math.pow(y,3));
            if(z%(int)z==0)
            System.out.println("x="+x+"  "+"y="+y+"    "+"z="+z);
           y++;
        }
    }}}
            
            
            
            
            