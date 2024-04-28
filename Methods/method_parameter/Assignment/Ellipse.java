class Ellipse 
{
	static void area(double a, double b)
	{
		final double pi=3.142;
		double area=pi*a*b;
		System.out.println("Area of Ellipse of radius1 is "+a+" and radius2 is "+b+" is "+area);
	}
	public static void main(String[] args) 
	{
		area(5.5,6.8);
	}
}
