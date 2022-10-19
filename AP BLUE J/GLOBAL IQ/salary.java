class salary 
{
    public static void basicsalary(int S)
    {
        double DA,HRA,TAX,T,G,B;
        B=S;
        DA=0.4*S;
        HRA=0.05*(S+DA);
        G=S+DA+HRA;
        System.out.println("BASIC="+B);
        System.out.println("DA="+DA);
        System.out.println("HRA="+HRA);
        System.out.println("GROSS SALARY="+G);
        if (G>10000)
        {
            TAX=0.1*G;
            
        }
        else
        {
            TAX=0.05*G;
           
        }
         System.out.println("TAX="+TAX);
            T=G-TAX;
            System.out.println("NET TOTAL="+T);
        }
    }