
class Series2{
    public static void main(int n){
        int i,a=0,b=1,c=2,d;
       if(n==0)
       System.out.print("");
        else if(n==1)
       System.out.print(a);
       else if(n==2)
       System.out.print(a+","+b);
       else if(n==3)
       System.out.print(a+","+b+","+c);
       else{
      System.out.print(a+","+b+","+c);
            for(i=4;i<=n;i++){
            d=a+b+c;
             System.out.print(","+d);
             a=b;
             b=c;
             c=d;
    }}}}