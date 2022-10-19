import java.util.*;
class Account{
    static int a[]=new int[100],b[]=new int[100];
    static String n[]=new String[100];
    Scanner sc=new Scanner(System.in);
    Account(){
    }
    void readRecord(){
        int i;
       for(i=0;i<100;i++){
           System.out.println("Enter name");
           n[i]=sc.nextLine();
           System.out.println("Enter Account number");
           a[i]=sc.nextInt();
           System.out.println("Enter balance amount");
           b[i]=sc.nextInt();
        }}
        void display(){
            int i;
             for(i=0;i<100;i++){
           System.out.println("NAME\t\tAccount number\t\tbalance amount");
          
           System.out.println(n[i]+"\t\t"+a[i]+"\t\t"+b[i]);
          
        }}
    void sort(){
    int i,j,t,t2;
    String t3="";
    for(i=1;i<99;i++){
        for(j=1;j<99-i;j++){
           if(a[i+1]>a[i])
           {
               t=a[i];
               t2=b[i];
               t3=n[i];
               a[i]=a[i+1];
               b[i]=b[i+1];
               n[i]=n[i+1];
               a[i+1]=t;
               b[i+1]=t2;
               n[i+1]=t3;
            }
            
        }}}
        public static void main(String args[]){
            Account ob=new Account();
            ob.readRecord();
            ob.display();
            ob.sort();
            ob.display();
        }}








        