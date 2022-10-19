//Ambiguity in Inheritance

class A
{
	public void show()
	{
		System.out.println("hello");
	}
}
class B extends A
{
	public void show()
	{
		super.show();
		System.out.println("hi");
	}
}
public class Ambiguity_Inherit
{
	public static void main(String a[])
	{
		B b=new B();
		b.show();
	}
}