import java.util.*;
class Menu_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for AN \n2 for NN");
        int ch,n,sq,d1,d2,k=0,cp,s=0;
        ch=sc.nextInt();
        System.out.println("Enter a number");
        n=sc.nextInt();
        sq=n*n;
        cp=n;
        switch(ch){
            case 1:
            while(cp>0){
            d1=cp%10;
            d2=sq%10;
            if(d1!=d2){
                k=1;
            break;}
            sq/=10;
            cp/=10;
        }
        if(k==1)
        System.out.println("Not an Automorphic no.");
        else
        System.out.println("Automorphic no."+n);
        break;
        case 2:
        while(cp>0){
            d1=cp%10;
            s+=d1;
            cp/=10;
        }if(n%s==0)
        System.out.println("Niven no."+n);
        else
        System.out.println("Not a Niven no.");
        break;
        default:
        System.out.println("Wrong choice");
    }
}
}
