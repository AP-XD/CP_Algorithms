import java.util.*;
class Fermat_last_theorem{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int y=1; 
        int x=sc.nextInt();
        for(int i=1;i<=n;i++){
                       
            double z=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            System.out.println(z);
           y=y+1;
        }}}
            
            
            
            
            