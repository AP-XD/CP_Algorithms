import java.util.*;
class Additive
{
    private int no;
    public void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        no = sc.nextInt();
        calc();
    }
    public void calc()
    {
        for(int i = no; i >= 2; i--)
        {
            int arr[] = new int[i];
            for(int j = 0; j < i-1; j++)
                arr[j] = 1;
            arr[i - 1] = (no - i) + 1;
            if(sum(arr) == no)
            {
                while(arr[i-1] >= arr[i-2])
                {
                    show(arr);
                    arr[i - 1]--; arr[i - 2]++;
                }
            }
        }
    }
    public int sum(int[] num)
    {
        int s = 0;
        for(int i = 0; i < num.length; i++)
            s += num[i];
        return s;
    }
    public void show(int num[])
    {
        for(int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");
        System.out.println();
    }
}
public class Main
{
    public static void main(String args[])
    {
        Additive a = new Additive();
        a.get();
    }
}
