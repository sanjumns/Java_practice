class Trapezoid 
{
	static void area()
	{
		final double half=0.5;
		double a=30;
		double b=50.78;
		double h=30.85;
		double area=half*(a+b)*h;
		System.out.println("Area of Trapezoid = "+half+"*("+a+"+"+b+")*"+h);
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		area();
	}
}
