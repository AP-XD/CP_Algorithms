class dd{
    static void kj(){
       
        int _123=45;
        int x=3;
        double p =5*-x+--x;
        System.out.print(p);

        int a=12, b=10;

        System.out.println("a++="+a+++"\n a>b ="+(a>b));
        System.out.println("++a="+ ++a);
        System.out.println("\n--a="+--a);
        System.out.println( "\n a!+(a+b)="+(a!=(a+b)));
        
        int m=2, n=15;
        for (int i=1;i<5; i++)
            m++;--n;
            System.out.println("m="+m +"\n n="+n);
            
            int ctr=0;
            for (int i=1; i<5;i++)
            for (int j=1; j<=5; j+=2)
                ++ctr;
                System.out.println(ctr);
            }     
            public static void main(String[]args)
            {
                int a=5;
                a++;
                System.out.println(a);
                a-=(a--)-(--a);
                System.out.println (a);
                double x=2.9, y=2.5;
                System.out.println(Math.min(Math.floor (x),y));
                System.out.println(Math.max(Math.ceil (x),y));

    }
    static void pat(){
        for(int i=1;i<=5;i++)
        {for (int k=2; k<=i;k++)
            System.out.print("  ");
            for (int j=i;j<=5;j++)
            System.out.print(j+" ");
            System.out.println();}}
        
     static void series (int n)
     {int s=0;
         
         for (int i=1;i<=n;i++){
          s+=(i*i+1)*Math.pow(-1,i+1);
     System.out.println((i*i+1)*Math.pow(-1,i+1));
    }
    System.out.print(s);
    }
        }
            






