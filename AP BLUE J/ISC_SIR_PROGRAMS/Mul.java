import java.util.*;
class Mul{
    void mat(){
        int r1,c1,r2,c2;
        int a[][],b[][],x[][];
        do{
            System.out.println("enter 1st row");
            r1=new Scanner(System.in).nextInt();
            System.out.println("enter 1st col");
            c1=new Scanner(System.in).nextInt();
            System.out.println("enter 2nd row");
            r2=new Scanner(System.in).nextInt();
            System.out.println("enter 2nd  col");
            c2=new Scanner(System.in).nextInt();
        }while((r1<=0)||(c1<=0)||(r2<=0)||(c2<=0)||(c1!=r2));
        a=new int[r1][c1];
        b=new int[r2][c2];
        x=new int[r1][c2];
        System.out.println("enter 1st arrary elements");
        for ( int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j]=new Scanner(System.in).nextInt();
            }
        }
        System.out.println("display 1st array elements");
        display(a);
        System.out.println("enter 2nd array elements");
        for ( int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                b[i][j]=new Scanner(System.in).nextInt();
            }
        }
        System.out.println("display 2nd array elements");
        display(b);
        for ( int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                x[i][j]=0;
                for(int k=0; k< c1; k++){
                    x[i][j]=x[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Final matrix");
        display(x);
    }

    void display(int z[][]){
        for(int i=0; i<z.length ; i++){
            for(int j=0; j <z[0].length ; j++){
                System.out.print(z[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Mul ob=new Mul();
        ob.mat();
    }
}
