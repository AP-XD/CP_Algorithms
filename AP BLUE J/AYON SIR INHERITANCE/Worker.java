public class Worker
{
	protected String name;
	protected double basic;
	public Worker(String n,double b)
	{
	    name=n;
	    basic=b;
	}
	public void display()
	{
	    System.out.println("Name = "+name);
	    System.out.println("Basic = "+basic);
	}	   
}
