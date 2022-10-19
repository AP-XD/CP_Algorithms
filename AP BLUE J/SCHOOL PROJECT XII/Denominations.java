import java.util.*;
class Denominations
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        int den[]={2000,1000,500,200,100,50,20,10,5,2,1},tn=0,c=0,i,r=0,b; /**storing all the denominations in an array*/
        String ones[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.print("Enter a 5-digit amount : ");
        int a=sc.nextInt(),cp=a,p=a;/**Entering an amount*/
        if(a>99999)/**Checking amount entered is more than 5 digit or not*/
        {
            System.out.println("INVALID AMOUNT");
        }
        else
        {          
            while(p>0)
            {
                r=r*10+p%10;/**generating reverse of the number*/
                p/=10;
            }
            while(r>0)
            {
                b=r%10;
                System.out.print(ones[b].toUpperCase()+" ");/**Displaying number in word format*/
                r/=10;
            }
            System.out.println("\nDENOMINATION:");
            for(i=0;i<11;i++) /**Since there are 11 different types of notes, hence we check for each note*/ 

            {
                c=a/den[i]; /** counting number of den[i] notes*/
                if(c!=0) /**printing that denomination if the count is not zero*/
                {
                    System.out.println(den[i]+"\t *\t"+c+"\t= "+den[i]*c);/**Displaying the different denominations of notes*/
                }
                tn=tn+c; /**finding the total number of notes*/
                a=a%den[i]; /**finding the remaining a whose denomination is to be found*/
            }
            System.out.println("--------------------------------");
            System.out.println("TOTAL\t\t\t= "+cp); /**printing the total amount*/
            System.out.println("--------------------------------");
            System.out.println("Total Number of Notes\t= "+tn); /**printing the total number of notes*/
        } 
    }/**end of main()*/
}/**end of Denominations*/