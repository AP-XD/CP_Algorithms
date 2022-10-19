import java.util.*;
import java.io.*;
class Sentence
{
    public static void main(String args[])throws IOException/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        int c=0,k=0,i;char ch;String s="",text="";/**Variable declaration and initialization*/
        FileWriter fw=new FileWriter("Sentence.txt",true);/**Writing the file in append mode*/
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        System.out.println("3 sentences are:");
        for(i=0;i<3;i++)
        {
            s=sc.nextLine();/**Accepting sentence from User*/
            pw.println(s);
        }
        pw.close();/**Saving and Closing file*/
        FileReader fr=new FileReader("Sentence.txt");
        BufferedReader br=new BufferedReader(fr);    
        while((text=br.readLine())!=null)
        {
            c++;
            System.out.println(c+". "+"vowel of sentence '"+text+"' are:");
            for(i=0;i<text.length();i++)
            {
                ch=text.charAt(i);
                if ("AEIOUaeiou".indexOf(ch)>=0)/**checking whether the extracted character is a vowel or not*/
                {
                    k++;
                    System.out.print(text.charAt(i)+" ");/**Displaying the vowels Sentence wise*/
                }
            }
            if(k==0)
                System.out.print("NO Vowels");
            k=0;
            System.out.println();
        }
    }/**end of main()*/
}/**end of Sentence*/