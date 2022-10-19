import java.util.*;
class Sbsearch{
    public void search(String x[], String se){
        int u=x.length-1;
        int l=0;//asc order
        int p=0;
        while(l<=u){
            int mid=(l+u)/2;
            if(x[mid].compareTo(se)>0)
                u=mid-1;
            else if(x[mid].compareTo(se)<0)
                l=mid+1;
            else
            {
                p=1;
                break;
            }
        }
        if(p==1)
            System.out.println("search sucessful");
        else
            System.out.println("search unsucessful");
    }

    void sort(String k[]){
        for(int i=0 ; i<k.length-1; i++){
            for(int j=0; j<k.length-i-1; j++){
                if(k[j].compareTo(k[j+1])>0){
                    String h=k[j];
                    k[j]=k[j+1];
                    k[j+1]=h;
                }
            }
        }
    }

    public static void main(String args[]){
        Sbsearch ob=new Sbsearch();
        System.out.println("enter size");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        String a[]=new String[s];
        for(int i=0; i<s ; i++){
            a[i]=sc.next();
        }
        ob.sort(a);
        System.out.println("enter the search elements");
        String k=sc.next();
        ob.search(a,k);
    }
}

           