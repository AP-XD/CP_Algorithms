import java.util.*;
class Num2Word7dig
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        String ty[]={"","","TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"},
        ten[]={"","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"},
        unit[]={"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"},
        b[]={" MILLION "," THOUSAND "," HUNDRED "};/**Variable declaration and initialization*/
        System.out.print("Enter any Number:");
        int n=sc.nextInt();/**Accepting number from user*/
        if(n<0)
        {
            n=-n;
            System.out.print("Negative Number\nAbsolute value in word form:");
        }
        else if(n<=10000000)
            System.out.print("You have entered:");
        if(n>10000000)
            System.out.println("OUT OF RANGE.....");

        else
        {
            int m=n/1000000,mh=(n/100000)%10,mt=(n/10000)%10,th=(n/1000)%10,h=(n/100)%10,t=(n/10)%10,u=n%10;/**finding the digit at thousand's, hundred's, ten's, unit's place respectively*/                      
            if(m!=0)
                System.out.print(unit[m]+b[0]);
            if(mh!=0)
                System.out.print(unit[mh]+b[2]);
            if(mt==1)
                System.out.print(ten[th+1]+b[1]);
            else if(mt>1)
                System.out.print(ty[mt]+" "+unit[th]+b[1]);
            else if(th!=0)
               System.out.print(unit[th]+b[1]);
            if(h!=0)
                System.out.print(unit[h]+b[2]);
            if((t!=0 || u!=0)&&(th!=0 || h!=0))
                System.out.print("AND");
            if(t==1)/**When digit at ten's place is 1, we have different words like Ten, Eleven etc.*/
                System.out.print(" "+ten[u+1]);
            else/**it is not 1 then we print the words following a normal pattern*/
                System.out.print(" "+ty[t]+" "+unit[u]);
        }
    }/**end of main()*/
}/**end of Num2Word*/