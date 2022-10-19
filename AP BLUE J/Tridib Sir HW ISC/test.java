class test
{
    static void main()
    {
        int a=2,b=-5;
        a=~(a+~b)+(b=(a+~b-~b));
        System.out.println("a="+a+"\nb="+b);
    }
}
