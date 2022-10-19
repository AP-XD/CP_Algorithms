import java.io.*;
public class Anagrams
{
    String str;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int counter=0;
    public void take()throws Exception
    {
        System.out.println("\nEnter the word:");
        str=br.readLine();
        show("",str);
        System.out.println("Total number of anagrams ="+counter);
    }

    public void show(String s, String str)
    {
        if(str.length()<=1)
        {
            counter++;
            System.out.println(s+str);
        }
        else
        {
            for(int i = 0; i< str.length(); i++)
            {
                String str1 = str.substring(i, i + 1);
                String str2 = str.substring(0, i);
                String str3 = str.substring(i + 1);
                show(s + str1, str2 + str3);
            }
        }
    }

    public static void main(String args[])throws Exception
    {
        Anagrams ob=new Anagrams();
        ob.take();
    }
}