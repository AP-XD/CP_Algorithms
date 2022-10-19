//Example of MultiLevel Inheritance

class Base_A
{
	Base_A()
	{
		System.out.println("1");
	}
}
class Sub_B extends Base_A
{
	Sub_B()
	{
		System.out.println("2");
	}
}
class Sub_C extends Sub_B
{
	Sub_C()
	{
		System.out.println("3");
	}
}
public class Multilevel_Inherit
{
	public static void main(String a[])
	{
		Sub_C obj=new Sub_C();
	}
}
