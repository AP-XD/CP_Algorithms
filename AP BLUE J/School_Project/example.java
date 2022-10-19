class example
{
    int a;
    static int count;
    example()
    {
        //constructor to initialize a
        a=0;
    }
    void getcount()
    {
        a=++count;
    }
    void givecount(){
      System.out.println("Value of a:"+a);
      System.out.println("Value of count:"+count);
}}
