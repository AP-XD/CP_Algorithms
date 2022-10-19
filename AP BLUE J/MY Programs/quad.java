class quad{
    float a,b,c,d,x1,x2;
    quad(int x,int y,int z){
        a=x;
        b=y;
        c=z;
    }
    void calculate(){
        d=b*b-4*a*c;
        if(d<0)
            System.out.print("Roots are not possible");
            else
            {
               x1=(float)(-b+Math.sqrt(d))/(2*a);
               x2=(float)(-b-Math.sqrt(d))/(2*a);
               System.out.print(x1+" , "+x2+" are the roots");
            }}}
        
        