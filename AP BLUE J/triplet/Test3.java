class Test3{
   
  static int s;
   public static void main(String [] args) {
    Test3 p=new Test3();
    p.start();
    System.out.println(s);}
    void start(){
        int x=7;
        twice(x);
        System.out.print(x+" ");
          
    }
    void twice(int x){
          x=x*2;
          s=x;
        }}