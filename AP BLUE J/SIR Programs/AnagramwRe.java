/* String combination program -by tridib 
 * Input :- "RAJ"
 * Output:- "RAJ"
 *          "RJA"
 *          "ARJ"
 *          "AJR"
 *          "JAR"
 *          "JRA"
 */

import java.io.*;
public class AnagramwRe{
    public static void main(String args[])
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String a=br.readLine();// "Incompatible types" message is shown when when compiled
        new String().comb(a);
    }// End of main() method
}// End of RajMaiti class

class String{
    public void comb(String s)
    {
        s.trim();
        int a[]=new int[s.length()];
        for(int i=0;i<a.length;i++)
            a[i]=1;

        int i=a.length-1;
        do
        { no=0;

            for(int j=i;j>=0;j--)
            {
                if(a[j]>s.length())
                {
                    for(int m=j;m<=i;m++)
                        a[m]=1;
                    if(j!=0) a[j-1]++; else no++;
                }
            }

            if(no==0){

                int che=0;

                for(int j=0;j<a.length;j++)
                {
                    for(int k=0;k<a.length;k++)
                    {
                        if(j!=k && a[j]==a[k])
                            che++;
                    }// End of inner for loop
                }// End of outer for loop
                if(che==0)
                {
                    for(int j=0;j<a.length;j++)
                        System.out.print(s.charAt(a[j]-1));
                }// End of if
            }

            a[i]++;

        }while(no==0);
    }// End of comb() method
}// End of String class