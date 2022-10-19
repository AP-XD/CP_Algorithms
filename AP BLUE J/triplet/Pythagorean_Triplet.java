import java.util.*;
class Pythagorean_Triplet{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of N");
        int n=sc.nextInt(),x,y=0,j;
        double z=0;
        for(x=1;x<=n;x++){
            y=1; 
            for(j=x;j<=n*n;j++){
                z=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
                if(z%(int)z==0)
                    System.out.println("x="+x+"  "+"y="+y+"    "+"z="+z);
                y++;
            }
        }
    }
}