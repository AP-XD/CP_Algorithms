import java.util.*;
class WordPotential
{
    int findP(String s) /** Function to find potential of a word*/
    {
        s = s.toUpperCase();
        int p = 0, l = s.length(),i;char ch;/**Variable declaration and initialization*/
        for(i=0; i<l; i++)
        {
            ch = s.charAt(i);
            p = p + (ch-64);/**sum of index of alphabets*/
        }
        return p;
    }
    
    void sortP(String w[], int p[]) /** Function to bubble sort the words in ascending order of their potential*/
    {
        int n = w.length, t1 = 0,i,j;String t2 = "",ans = "";/**Variable declaration and initialization*/
        for(i=0; i<n-1; i++)
        {
            for(j=i+1; j<n; j++)
            {
                if(p[i]>p[j])
                {
                    t1 = p[i];
                    p[i] = p[j];
                    p[j] = t1;
                    t2 = w[i];
                    w[i] = w[j];
                    w[j] = t2;
                }
            }
        }
        for(i=0; i<n; i++)
        {
            ans = ans + " " + w[i];
        }
        ans = ans.trim();
        System.out.println("\nOUTPUT:"+ans+".");
    }

    public static void main(String args[])/**main() declaration*/
    {
        WordPotential ob = new WordPotential();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String s = sc.nextLine();/**Accepting sentence from user*/
        StringTokenizer str = new StringTokenizer(s," .,?!");
        int n = str.countTokens(),p[] = new int[n],i;String words[] = new String[n];
        for(i=0; i<n; i++)
        {
            words[i] = str.nextToken(); /** Saving words one by one in an array*/
            p[i] = ob.findP(words[i]); /** Saving potential of every word*/
        }
        /** Printing the words along with their potential*/
        System.out.println("Potential:");
        for(i=0; i<n; i++)
        {
            System.out.print(words[i]+" = "+p[i]+"    ");/**Displaying the output*/
        }
        ob.sortP(words,p);
    }/**end of main()*/
}/**end of WordPotential*/