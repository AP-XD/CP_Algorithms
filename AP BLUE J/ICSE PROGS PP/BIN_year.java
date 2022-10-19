import java.util.*;
class BIN_year{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year of graduation");
        int y,l=0,u,mid=0,k=0;
        y=sc.nextInt();
        int g[]={1990,1996,1998,2000,2003,2006,2009,2012,2014};
        u=g.length;
        while(l<=u){
            mid=(l+u)/2;
            if(y>g[mid])
            l=mid+1;
            if(y<g[mid])
            u=mid-1;
            if(y==g[mid]){
            k=1;
            break;}
        }
        if(k==1)
          System.out.println("Record exists");
          else
          System.out.println("Record does not exist");
        }}
            