import java.util.Scanner;
class Kaprekar
{
    public static int noOfDigits(int num)
    {
        int count=0;
        do
        {
            num /= 10;
            ++count;
        }
        while(num!=0);
        return count;
    }

    public static boolean isKaprekar(int num)
    {
        int sq = num*num;
        int c = noOfDigits(num);
        int a, b;
        a =(int)(sq%(Math.pow(10, c)));
        b =(int)(sq/(Math.pow(10, c)));
        if((a+b)==num)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();
        if(isKaprekar(num))
            System.out.println(num + " is a Kaprekar Number");
        else
            System.out.println("Not a Kaprekar Number");
    }
}