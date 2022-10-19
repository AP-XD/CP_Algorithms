import java.util.*;
class df{
    long bin_decD(long x ,long c){
        if((x==1)||(x==0)){
            return (long) Math.pow(2,c)*x;
        }
        else {
            return (long)Math.pow(2,c)*(x%10) + bin_decD(x/10,++c);
        }
    }

    double bin_decF(long x ,long c){
        if((x==1)||(x==0)){
            return  Math.pow(2,c)*x;
        }
        else {
            return Math.pow(2,c)*(x%10) + bin_decF(x/10,++c);
        }
    }

    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a binary no");
        double x=s.nextDouble();
        StringTokenizer d=new StringTokenizer(Double.toString(x).trim(),".");
        String a=d.nextToken();
        String b=d.nextToken();
        df fu=new df();
        long q=fu.bin_decD(Long.parseLong(a),0);
        double g=fu.bin_decF(Long.parseLong(b),(long)(-1*b.length()));
        System.out.println(q+g);
    }
}