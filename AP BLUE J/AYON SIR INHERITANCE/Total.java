class Total
{
    public static void main(String args[])
    {
        int total = 0;
        Father f = new Father();
        Child c = new Child();
        Age age;
        age = f;        
        age.getData();
        System.out.print("Father's age is = "+age.display());
        total+=age.display();        
        age = c;        
        age.getData();
        System.out.print("Child's age is = "+age.display());
        total+=age.display();
        System.out.println("\nTotal age is = "+total);
    }
}