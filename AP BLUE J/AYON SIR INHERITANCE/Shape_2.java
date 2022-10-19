import java.io.*;
class Shape_2
{
	private int length,breadth;
	private float r;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void getData()throws IOException
	{
		System.out.print("\nEnter the value of length:-> ");
		length = Integer.parseInt(br.readLine());
		System.out.print("\nEnter the value of breadth:-> ");
		breadth = Integer.parseInt(br.readLine());;
		System.out.print("\nEnter the value of radius:-> ");
		r = Float.valueOf(br.readLine()).floatValue();	
	}
	public void putData()
	{   
	    try
	    {
	        getData();
	    }
	    catch(Exception e){ }   
		System.out.print("\nThe value of length= "+length);
		System.out.print("\nThe value of breadth= "+breadth);
		System.out.print("\nThe value of radius= "+r);
	}
	int rectangle()
	{
		return length*breadth;
	}
	float circle()
	{
		return 3.14f*r*r;
	}
}