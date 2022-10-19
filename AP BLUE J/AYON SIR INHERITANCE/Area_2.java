class Area_2 extends Shape_2
{
	private int rec_area;
	private float area;	
	Area_2()
	{   
	    putData();
		rec_area=rectangle();
		area=circle();
	}
	void show()
	{
		System.out.print("\nThe area of the rectangle:-> "+rec_area);
		System.out.print("\nThe area of the circle:-> "+area);
	}
	
}