import java.util.*;
public class remove_duplicate_array_elements
{
    public static void main()
    { 
        int i,j,c =0;
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 5 elements : ");
        for(i = 0; i < 5; i++)
            a[i] = sc.nextInt();
        System.out.print("Array after removing the duplicate elements :");
        for(i = 0; i < 5; i++)
        {
            for(j = 0; j < 5; j++)
            {
                if(a[i] == a[j])
                    c++;
            }
            if(c >= 1)
                System.out.print(a[i]+"  ");
            c = 0;
        }
    }
}
