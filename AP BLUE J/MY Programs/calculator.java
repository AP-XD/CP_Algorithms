import java.util.*;
class calculator{
    Scanner sc =new Scanner(System.in);
    void add(){
        int a=0,n;
        char ch;
        do{
            System.out.println("enter the Number");
            n=sc.nextInt();
            a=a+n;
            System.out.println("Do you want to continue addition?('y'/'n')");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        System.out.println("Total Sum:"+a);
    }

    void multi(){
        int a=1,n;
        char ch;
        do{
            System.out.println("enter the Number");
            n=sc.nextInt();
            a=a*n;
            System.out.println("Do you want to continue multiplication?('y'/'n')");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        System.out.println("Total Multiplied value:"+a);
    } 

    void substraction(){
        int a=0,n;
        char ch;
        do{
            System.out.println("enter the Number");
            n=sc.nextInt();
            a=a-n;
            System.out.println("Do you want to continue substraction?('y'/'n')");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        System.out.println("Total Substracted value:"+a);
    } 

    void division(){
        double n,c=1,d,m1=1,m2=1;
        char ch;
        do{
            System.out.println("enter the Number");
            n=sc.nextInt();
            if(c==1)
                m1=n;
            else if(c!=1)
                m2=m2*n;
            c++;
            System.out.println("Do you want to continue division?('y'/'n')");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        d=m1/m2;
        System.out.println("Total Divide value:"+d);
    }

    void sw(){
         char k;
        do{
           
            System.out.println("Press + for addition\nPress - for substaction\nPress * for mutiplication\nPress / for division");
            char ch=sc.next().charAt(0);
            switch(ch){
                case '+':
                add();
                break;
                case '-':
                substraction();
                break;
                case '/':
                division();
                break;
                case '*':
                multi();
                break;
                default:
                System.out.println("Wrong choice");
            }System.out.println("Do you want to continue calculating?('y'/'n')");
            k=sc.next().charAt(0);
        }while(k=='y' || k=='Y');
    }

    void main(String args[]){
        
        sw();
    }}