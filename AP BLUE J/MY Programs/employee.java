import java.io.*;
class employee{
    String empname;
    int empcode;
    double basicpay;
    employee(){
        empname="";
        empcode=0;
        basicpay=0.0;}

    employee(String n,int p,double q){
        empname=n;
        empcode=p;
        basicpay=q;}  

    void salarycal(){
        double salary,da=0.3*basicpay,hra=0.4*basicpay,ts,sp=0;
        
        salary=basicpay+da+hra;
        if(empcode<=15)
        {if(salary<=15000)
          sp=0.2*salary;
            if(sp>2500)
                sp=2500;
        }
        else
            sp=1000;
        ts=salary+sp;
        System.out.println("Total Salary:"+ts);
    }

    public void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employee Name,code and Basicpay respectively");
        empname=br.readLine();
        empcode=Integer.parseInt(br.readLine());
        basicpay=Double.parseDouble(br.readLine());

        employee ob=new employee(empname,empcode,basicpay);
        ob.salarycal();
    }}

                