import java.util.*;
class Array_Break{
    void array(){
      Scanner sc=new Scanner(System.in);
      int s,mid;
      do{
          System.out.println("Enter Size");
          s=sc.nextInt();
        }while(s<=0);
        int x[]=new int[s]; 
        for(int i=0;i<s;i++){
            x[i]=sc.nextInt();
        }
       
        mid=s/2;
        int a[]=new int[mid], b[]=new int[s-mid];
         for(int i=0;i<a.length;i++){
            a[i]=x[i];
        }
        
         for(int i=0;i<b.length;i++){
            b[i]=x[mid+i];
        }
        sortasc(a);
        sortdes(b);
        System.out.println("First array slot");
        display(a);
        System.out.println("Second array slot");
        display(b);
    }
    void sortasc(int x[]){
        for(int i=0;i<x.length-1;i++){
         for(int j=0;j<x.length-i-1;j++){ 
             if(x[j]>x[j+1]){
                 int t=x[j];
                 x[j]=x[j+1];
                 x[j+1]=t;
                }}}}
                 void sortdes(int x[]){
        for(int i=0;i<x.length-1;i++){
         for(int j=0;j<x.length-i-1;j++){ 
             if(x[j]<x[j+1]){
                 int t=x[j];
                 x[j]=x[j+1];
                 x[j+1]=t;
                }}}}
              void  display(int x[]){
            for(int i=0;i<x.length;i++){  
                System.out.print(x[i]+"  ");
            }}}
            
        
    