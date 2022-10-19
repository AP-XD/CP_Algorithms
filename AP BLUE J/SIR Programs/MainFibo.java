/**Question
Inline image 1
Program :*/
import java.util.*;
class FiboString
{   private String x,y,z; private int n;
    FiboString()
    { x="a";y="b";z=y+x;
    }

    void accept()
    { System.out.print("Enter number of terms : ");
        n=new Scanner(System.in).nextInt();
    }

    void generate()
    {  System.out.print(x+","+y+","+z+",");n=n-2;
        while(--n>0)
        { x=y;y=z;
            z=y+x;
            System.out.print(z+",");
        }
    }
}
public class MainFibo
{ public static void main(String args[])
    {FiboString ob=new FiboString();
        ob.accept();
        ob.generate();
    }
}