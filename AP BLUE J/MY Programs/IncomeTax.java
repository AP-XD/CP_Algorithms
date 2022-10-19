class IncomeTax{
    public static void tax(String name,int income){
        double t;
        if(income<=50000)
            t=0.0;
        else if(income>50000 && income<=100000)
            t=(income-50000)*0.1;
        else if(income>100000 && income<=1500000)
            t=1000+(income-100000)*0.2;
        else
            t=19000+(income-150000)*0.3;
        System.out.println("Employee Name\t\t\t\tIncome Tax");
        System.out.println(name+"\t\t\t\t\t"+t);
    }}
