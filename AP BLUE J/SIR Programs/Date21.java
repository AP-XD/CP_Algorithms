import java.util.*;
class Date21{
    void accept(){
        Scanner sc=new Scanner(System.in);
        int n ; int c;
        String mon[]={"Jan","Feb","March","April", "May","June","July", "Augest","Sept","Octo","Nov", "Dec","jan"};         
        int a1[]={31,28, 31, 30,31,30,31,31,30,31,30,31,31};
        int a2[]={31,29, 31, 30,31,30,31,31,30,31,30,31,31};
        do{
            System.out.print("n=");
            n=sc.nextInt();
            c=Integer.toString(n).length();
            if(c<=4)
                System.out.println("Invalid..Plz re enter");
        }while(c<=4);
        int y=n%10000;
        int d=n/10000;
        int s=0;
        String m="";
        int k=1;
        if(d>365){k=y;
            y=y+1;
        }
        System.out.println("year="+y);
        System.out.println("Days="+d);
        if(isLeap(k)){
            for(int i=0;;i++){
                if(i<12)
                    s=s+a2[i%12];
                else
                    s+=a1[i%12];
                if(s>d){
                    d=s-d;
                    d=a1[i%12]-d;
                    m=mon[i%12];
                    break;
                }
                if(s==d)
                { d=a1[i%12]-d;
                    m=mon[i%12];
                    break;
                }
            }
        }
        else
        {
            for(int i=0;;i++){
                if(i<=12)
                    s=s+a1[i%12];
                if(s>d){
                    d=s-d;
                    if(isLeap(k))
                        d=a1[i%12]-d-1;
                    else
                        d=a1[i%12]-d;
                    m=mon[i%12];
                    break;
                }
                if(s==d)
                { d=a1[i%12]-d;
                    m=mon[i%12];
                    break;
                }
            }  
        }
        System.out.println(d +m+ y);
    }   

    boolean isLeap(int y){
        if( (y%4==0 && y%100!=0) ||( y%400==0))
            return true;
        return false;
    }
}