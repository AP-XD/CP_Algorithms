import java.util.*;
class series{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
            System.out.println("Enter no of terms");
            int n=sc.nextInt();
            double s=1,s2=0;
            for(int i=2;i<=n+1;i++){
                s+=i;
                s2+=1/s;
            }
            System.out.println("SUM:"+s2);
            break;
            
            case 'b':
            int x,m,n2,b=0,j;
            double s3=0,s4=0,p=1;
            System.out.println("Enter value of x,m,n");
            x=sc.nextInt();
            m=sc.nextInt();
            n2=sc.nextInt();
            for(int i=10;i<=m;i+=5){
                s3=x+b;
                for(j=1;j<=s3;j++){
                    p*=j;
                }s4+=p/i;
                p=1;
                b+=2;
            }
            System.out.println("sum:"+s4);
             break;   
            default:
            System.out.println("Wrong choice");
        }}}