class Circle 
{
	static void area(double r)
	{ 
		final double pi=3.142;
		double area=pi*r*r;
		System.out.println("Area of circle with a radius "+r+" is "+area);
	}
	public static void main(String[] args) 
	{
		area(5.65);
	}
}
