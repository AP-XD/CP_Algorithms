import java.io.*;
class GS5{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch;
        double f,c;
        System.out.println("Press 1 to convert from Fahrenheit to Celcius");
        System.out.println("Press 2 to convert from Celcius to Fahrenheit");
        ch=Integer.parseInt(br.readLine());
        switch(ch){
        case 1:           
        System.out.println("Enter Fahrenheit temperature");
        f=Double.parseDouble(br.readLine());
        c=5.0/9*(f-32);
        System.out.println("Temperature in Celcius:"+c);
        break;
        case 2:
        System.out.println("Enter Celcius temperature");
        c=Double.parseDouble(br.readLine());
        f=(c/5*9.0)+32;
        System.out.println("Temperature in Fahrenheit:"+f);
        break;
        default:
        System.out.println("Wrong input");
        break;
    }
}
}