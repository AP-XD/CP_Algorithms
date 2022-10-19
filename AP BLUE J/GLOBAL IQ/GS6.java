import java.io.*;
class GS6{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char ch;
        int r,s,l,b,as,ar;
        double pi=22/7.0,ac;
        System.out.println("Press 'c' to calculate area of circle");
        System.out.println("Press 's' to calculate area of square");
        System.out.println("Press 'r' to calculate area of rectangle");
        ch=(char)(br.read());
        switch(ch){
        case 'c':           
        System.out.println("Enter radius of circle");
        r=Integer.parseInt(br.readLine());
        ac=pi*r*r;
        System.out.println("Area of circle:"+ac);
        break;
        case 's':
        System.out.println("Enter side of square");
        s=Integer.parseInt(br.readLine());
        as=s*s;
        System.out.println("Area of square:"+as);
        break;
        case 'r':
        System.out.println("Enter length of rectangle");
        l=Integer.parseInt(br.readLine());
        System.out.println("Enter breadth of rectangle");
        b=Integer.parseInt(br.readLine());
        ar=l*b;
        System.out.println("Area of rectangle:"+ar);
        break;
        default:
        System.out.println("Wrong input");
        break;
    }
}
}