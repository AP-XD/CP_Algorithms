import java.util.*;
class Date{
    int dd;
    int mm;
    Date(int nd, int nm){
        dd=nd;
        mm=nm;
    }

    int dateTodatenumber(Date dt){ int s=0;
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=1; i<dt.mm ; i++){
            s+=a[i-1];
        }
        s+=dt.dd;
        return s;
    }

    Date dateNumberToDate(int dn){ 
        Date ob1=new Date(0,0);
        int s=0;
        int x=dn;
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i< a.length ; i++){
            s=s+a[i];
            x=x-a[i];
            if(s>=dn){
                ob1. mm=i+1 ;
                ob1.dd= a[i]-(s-dn);
                break;
            }
        }
        System.out.println("the dd-mm format");
        System.out.println(ob1.dd+"-"+ob1.mm);
        return ob1;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter date in dd-mm format");
        String s=sc.next();
        int k=s.indexOf('-');
        int a=Integer.parseInt(s.substring(0,k));
        int b=Integer.parseInt(s.substring(k+1));
        Date ob=new Date(a, b);
        int z=ob.dateTodatenumber(ob);
        System.out.println("Days number="+z);
        Date c=ob.dateNumberToDate(z);
    }
}