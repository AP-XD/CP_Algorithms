import java.util.*;
class Ph_No{
    public static void main(String args[])
    
    {String n[]={"Arvind Kumar","Bhulan Chowdhury","Chetan Ray","Harsh Kanodia","Peter Topno","Tanay Gathani"};
    String p[]={"9830452173","9831245751","9741812635","9830512632","9830162565","9831425136"},y="",h="";
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        int l=0,u,mid=0,k=0,i,j;
        y=sc.nextLine();
        u=n.length;
        while(l<=u){
            mid=(l+u)/2;
            if(y.compareTo(n[mid])>0)
            l=mid+1;
            if(y.compareTo(n[mid])<0)
            u=mid-1;
            if(y.compareTo(n[mid])==0){
            k=1;
            break;}
        }if(k==1){
            for(i=0;i<6;i++){
                if(y.equals(n[i]))
                {
                    break;}
                }
                h=p[i].substring(0,4);
                for(j=0;j<6;j++){
                    if(h.equals(p[j].substring(0,4)))
                    {System.out.println(n[j]+":"+p[j]);
                    }}}}}