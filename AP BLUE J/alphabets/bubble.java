import java.util.*;
class bubble{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String a[]=new String[5],t2="";
        int b[]=new int[5],i,t,j;
        for(i=0;i<5;i++){
            System.out.println("Enter name");
            a[i]=sc.next();
            System.out.println("Enter marks");
            b[i]=sc.nextInt();
        }
        for(i=0;i<4;i++){
            for(j=0;j<5-i;j++){
                if(b[i+1]>b[i])
                {t=b[i];
                    b[i]=b[i+1];
                    b[i+1]=t;
                    t2=a[i];
                   a[i]=a[i+1];
                    a[i+1]=t2; }
                }}
                 System.out.println("Rank\t\tStudent name\t\tMarks");
               for(i=0;i<5;i++){   
                 System.out.println(i+1+"\t\t"+a[i]+"\t\t\t"+b[i]);
                }}}