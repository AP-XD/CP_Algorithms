import java.util.*;

class Diag_array
{
    public static void main(String[] args)
    {int r,c,i,j,s1=0,s2=0;
        Scanner sc = new Scanner(System.in);

        do
        {System.out.println("Enter no. of rows and column");
            r=sc.nextInt();
            c=sc.nextInt();
        }
        while(r<=0 || c<=0 || r!=c);
        int a[][]=new int [r][c];
        System.out.println("Enter elements");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }

        }for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(i==j)
                    s1+=a[i][j];
                if((r-i)==(c-j))
                    s2+=a[i][j];
            }

        }System.out.println("1st Diagonal summation="+s1+"\n2nd  Diagonal summation="+s2);


    }
}
