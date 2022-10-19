import java.io.*;
class GS7{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,ch,a;
        double r,l,s;
        System.out.println("Press 1 to calculate Natural Logarithm");
        System.out.println("Press 2 to calculate Absolute value");
        System.out.println("Press 3 to calculate Square root");
        System.out.println("Press 4 to calculate random numbers between 0 to 1");
        System.out.println("Enter a number");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter your choice");
        ch=Integer.parseInt(br.readLine());
        switch(ch){
        case 1:           
        l=Math.log(n);
        System.out.println("Natural Logarithm:"+l);
        break;
        case 2:
        a=Math.abs(n);
        System.out.println("Absolute Value:"+a);
        break;
        case 3:
        s=Math.sqrt(n);
        System.out.println("Square Root:"+s);
        break;
        case 4:
        r=Math.random();
        System.out.println("Random numbers between 0 to 1:"+r);
        break;
        default:
        System.out.println("Wrong input");
        break;
    }
}
}