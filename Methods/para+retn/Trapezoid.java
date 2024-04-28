class Trapezoid
{
	static double area(double a, double b, double h)
	{
		final double half=0.5;
		double res=half*(a+b)*h;
		return res;
	}
	public static void main(String[] args) 
	{
		double x=area(7.8, 4.8, 2.5);
		System.out.println(x);
	}
}
