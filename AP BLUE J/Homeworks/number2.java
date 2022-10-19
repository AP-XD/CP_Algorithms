import java.util.*;

class number2
{
    void process(){
        Scanner sc =new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter a number");
            a=sc.nextInt();

        }while(a>=10000);
        int x[]={1000,100,90,80,70,60,50,40,30,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        String cp="",y[]={"thousand","hundred","ninety","eighty","seventy","sixty","fifty","forty","thirty","twenty","nineteen","eightteen","seventeen","sixteen","fifteen","fourteen","thirteen","twelve","eleven","ten","nine","eight","seven","six","five","four","three","two","one"};
        for(int i=0;i<x.length;i++){
            int c=a/x[i];
            if(a>0 && c>0){
                if (c==0)
                    cp="";
                else if(c==1)
                    cp=y[28];
                else if(c==2)
                    cp=y[27];
                else if(c==3)
                    cp=y[26];
                else if(c==4)
                    cp=y[25];
                else if(c==5)
                    cp=y[24];
                else if(c==6)
                    cp=y[23];
                else if(c==7)
                    cp=y[22];
                else if(c==8)
                    cp=y[21];
                else if(c==9)
                    cp=y[20];
                else if(c==10)
                    cp=y[19];
                if(x[i]==1000 || x[i]==100)
                    System.out.print(cp+" "+y[i]+"  ");
                else
                    System.out.print(y[i]+"  ");

            }a=a%x[i];
        }
    }

    public static void main(String[] args)
    {
        number2 ob=new number2();
        ob.process();}}
