import java.util.*;
class Combine{
    int s;
    int num[];
    Combine(int s1){
        s=s1;
        num=new int[s];
    }

    void getElement(){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<s; i++)
            num[i]=sc.nextInt();
        System.out.println("original array");
        display(num);
    }

    void seperatePosNeg(){
        int c=0,c1=0;
        for(int i=0;i<s;i++){
            if(num[i]>0)
                c++;
            else
                c1++;
        }
        int positive[]=new int[c];
        int negetive[]=new int[c1];
        int p=-1,p1=-1;
        for(int i=0;i<s;i++){
            if(num[i]>0)
                positive[++p]=num[i];
            else
                negetive[++p1]=num[i];
        }
        arrangement(positive,negetive);
        System.out.println("positive array");
        display(positive);
        System.out.println("Negetive array");
        display(negetive);
    }

    void arrangement(int p[], int n[]){
        int append[]=new int[s];
        int c1,c4,c3;
        c1=c4=c3=0;
        while(c1<p.length && c4 < n.length){
            append[c3++]=n[c4++];
            append[c3++]=p[c1++];
        }
        while(c4 < n.length)
            append[c3++]=n[c4++];

        while(c1<p.length){
            append[c3]=p[c1];
            c3++; c1++;
        }
        System.out.println("final combined array");
        display(append);
    }

    void display(int k[]){
        for(int i=0; i<k.length ; i++)
            System.out.print(k[i]+",");
        System.out.println();
    }

    public static void main(String args[]){
        Combine ob=new Combine(new Scanner(System.in).nextInt());
        ob.getElement();
        ob.seperatePosNeg();
    }
}
