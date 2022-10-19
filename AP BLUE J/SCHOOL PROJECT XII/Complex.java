class Complex
{
    int x,y;/**Instance variable declaration*/
    Complex(int r,int i)/**Parameterized Constructor*/
    {
        x=r;
        y=i;
    }

    Complex add(Complex obj)
    {
        int radd,iadd;/**Variable declaration and initialization*/
        radd=this.x+obj.x;
        iadd=this.y+obj.y;
        Complex ob=new Complex(radd,iadd);/**object creation*/
        return ob;
    }
    void display()
    {
        Complex ob=new Complex(x,y);/**object creation*/
        if(y<0)
        System.out.println(ob.x+""+ob.y+"i");/**displaying the complex number*/
        else
        System.out.println(ob.x+"+"+ob.y+"i");/**displaying the complex number*/
    }
}/**end of Complex*/