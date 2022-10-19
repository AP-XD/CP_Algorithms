import java.util.*;
public class AscDscBubble
{
    private int x[],s;
    void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array size");
        s = sc.nextInt();
        x = new int [s];
        System.out.println("Enter the "+s+" array elements one by one");
        for (int i=0; i<s; i++)
            x[i] = sc.nextInt();
        display();
        System.out.println();
    }

    void sort()
    {
        int mid = (s-1)/2;
        for(int i =0;i<mid;i++)
        {
            for (int j = 0 ; j<mid-i-1;j++)
            {
                if (x[j]>x[j+1])
                {
                    int t = x[j];
                    x[j] = x[j+1];
                    x[j+1] = t;
                }
            }
        }

        for(int i = 0;i<s-mid-1;i++)
        {
            for (int j = mid+1 ; j<s-i-1;j++)
            {
                if (x[j]<x[j+1])
                {
                    int t = x[j];
                    x[j] = x[j+1];
                    x[j+1] = t;
                }
            }
        }
        display();
    }

    void display()
    {
        for (int i = 0; i<s; i++)
            System.out.print(x[i] + " ");
    }

    public static void main(String args[])
    {
        AscDscBubble ob = new AscDscBubble();
        ob.input();
        ob.sort();
    }
}