class G190
{
    public  static void main(String args[])
    {
        double B=8500,DA,TA,HRA,G;
        DA=0.2*B;
        TA=0.12*B;
        HRA=0.1*B;
        G=B+DA+TA+HRA;
        System.out.println("GROSS SALARY:"+G);
    }
}