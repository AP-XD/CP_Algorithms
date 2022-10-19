package Others;

import java.util.*;
class ARR_FREQ{
    
    static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,a[]=new int[n];
        for (i=0;i<n;i++){
            System.out.println("enter the value of a["+i+"]");
            a[i]=sc.nextInt();
            if(a[i]<=0)
                i--;
        }remove(a);
    }

    static void remove(int x[]){
        int i,j=0,c=0,c2[]=new int[x.length],k=0;
        for(i=0;i<x.length;i++){
            for(j=0;j<x.length;j++){
                if(x[i]==x[j] && x[i]!=0)
                    c++;
                } if(c>1){
                    c2[k++]=c;
                    x[i]=0;}
                    c=0;
            
        }
        System.out.println("the values are:");
        for(i=0;i<x.length;i++){
            
            if(x[i]!=0)
                System.out.println(x[i]);}
                for(i=0;i<c2.length;i++)
                System.out.println(c2[i]);
        }}