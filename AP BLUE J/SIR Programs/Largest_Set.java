import java.util.Scanner;
class Largest_Set{
    private int largestSetSize(int a[]){
        int maxSize=0,size=1;
        for(int i=0;i<a.length;i++){
            size=1;
            for(int j=i;j<a.length-1;j++){
                if((a[j]+1)==a[j+1])
                    ++size;
                else
                    break;
            }
            if(size>maxSize)maxSize=size;
        }
        return maxSize;
    }

    private void printSet(int a[]){
        int s=largestSetSize(a);
        System.out.println("the consecutive nos are");
        for(int i=0;i<a.length;i++){
            boolean c=false;
            if(i+s<=a.length){
                for(int j=i;j<i+s-1;j++){
                    if((a[j]+1)==a[j+1])
                        c=true;
                    else{
                        c=false;break;}
                }
                if(c){
                    for(int j=i;j<i+s;j++)
                        System.out.print(a[j]+" ");
                    System.out.println();
                    System.out.println("Index from:"+i+"to"+(s+i-1));
                }
            }
        }
    }

    public static void main(String args[]){
        int s;
        do{
            System.out.println("Enter Size");
            s=new Scanner(System.in).nextInt();
        }while(s<=0);
        int a[]=new int[s];
        System.out.println("Enter no");
        for(int i=0;i<s;i++)
            a[i]=new Scanner(System.in).nextInt();
        System.out.println("Original Array");
        for(int i=0;i<s;i++)
            System.out.print(a[i]+" ");
        new Largest_Set().printSet(a);
    }
}