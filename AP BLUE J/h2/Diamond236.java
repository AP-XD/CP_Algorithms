class Diamond236{
  public static void main(String[] args) {
     int c=0,a=2,b=6;
      while(b>0){
          if(b%2==1)c=c+a;
          b=b/2;
          a=a+a;}
          System.out.println("c="+c);
         }}