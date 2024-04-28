class Trapezoid 
{
	static void area(double a, double b, double h)
	{
		final double half=0.5;
		double area=half*(a+b)*h;
		System.out.println("The area of Trapezoid with a="+a+" b="+b+" and h="+h+" is "+area);
	}
	public static void main(String[] args) 
	{
		area(30,40.2,11.5);
	}
}
