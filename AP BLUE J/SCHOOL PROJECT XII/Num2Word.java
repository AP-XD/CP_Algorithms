import java.util.*;
class Num2Word
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        String ty[]={"","","TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"},ten[]={"","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"},unit[]={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};/**Variable declaration and initialization*/
        System.out.print("Enter any Number:");
        int n=sc.nextInt();/**Accepting number from user*/
        if(n<0)
        {
            n=-n;
            System.out.print("Negative Number\nAbsolute value in word form:");
        }
        else if(n<=1000)
            System.out.print("You have entered:");
        if(n>1000)
            System.out.println("OUT OF RANGE.....");

        else
        {
            int th=n/1000,h=(n/100)%10,t=(n/10)%10,u=n%10;/**finding the digit at thousand's, hundred's, ten's, unit's place respectively*/                      
            if(th!=0)
                System.out.print(unit[th]+" THOUSAND");
            if(h!=0)
                System.out.print(" "+unit[h]+" HUNDRED");
            if((t!=0 || u!=0)&&(th!=0 || h!=0))
                System.out.print(" AND");
            if(t==1)/**When digit at ten's place is 1, we have different words like Ten, Eleven etc.*/
                System.out.print(" "+ten[u+1]);
            else/**it is not 1 then we print the words following a normal pattern*/
            System.out.print(" "+ty[t]+" "+unit[u]);
        }
    }/**end of main()*/
}/**end of Num2Word*/