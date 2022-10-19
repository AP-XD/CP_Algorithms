import java.util.*;
class series2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
            System.out.println("Enter no of terms");
            int n=sc.nextInt();
            double s=1,s2=0,s1=0;
            for(int i=2;i<=n+1;i++){
                s+=i;
                s2+=i;
                s1+=s/s2;
            }
            System.out.println("SUM:"+s1);
            break;
            
            case 'b':
            int n2;String s4="100";
            
            System.out.println("Enter value n");
            
            n2=sc.nextInt();
            for(int i=1;i<=n2;i++){
                System.out.print(s4+", ");
                s4+="0";
            }
           
             break;
            default:
            System.out.println("Wrong choice");
       }}}