import java.util.*;
import java.io.*;
class Number
{
    boolean isPrime(int n)
    {
        int i,c=0;/**Variable declaration and initialization*/
        /**checking whether the number is Prime or not by best logic*/
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==0 && n>=2)
            return true;
        else
            return false;
    }

    boolean isPalin(int n)
    {
        int i,cp=n,d=0,r=0;/**Variable declaration and initialization*/
        /**checking whether the number is Palindrome or not*/
        while(cp>0)
        {
            d=cp%10;/**extracting last digit of the number*/
            r=r*10+d;/**forming the reversed number*/
            cp/=10;
        }
        if(r==n)
            return true;
        else 
            return false;
    }

    public static void main(String args[])throws IOException/**main() declaration*/
    {      
        Scanner sc=new Scanner(System.in);
        FileWriter fw=new FileWriter("Number.txt",true);/**Writing the file in append mode*/
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        Number ob=new Number();
        int n,i,in,n2=0;String t="";/**Variable declaration and initialization*/
        System.out.println("Enter the value of N:");
        n=sc.nextInt();/**Accepting value of N from User*/
        System.out.println("Enter the numbers");
        for(i=1;i<=n;i++)
        {
            in=sc.nextInt();/**Accepting number from User*/
            pw.println(in);
        }
        pw.close();/**Saving and Closing file*/
        FileReader fr=new FileReader("Number.txt");
        BufferedReader br=new BufferedReader(fr);      
        while((t=br.readLine())!=null)
        {
            n2=Integer.parseInt(t);
            if(ob.isPrime(n2))
                System.out.println("The number "+n2+" is Prime");/**Displaying the Prime numbers*/
            if(ob.isPalin(n2))
                System.out.println("The number "+n2+" is Palindrome");/**Displaying the Palindrome numbers*/
        }
    }/**end of main()*/
}/**end of Number*/