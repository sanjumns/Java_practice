class Ellipse
{
	static double area(double a, double b)
	{
		final double pi=3.142;
		double res=pi*a*b;
		return res;
	}
	public static void main(String[] args) 
	{
		double x=area(4.3,7.2);
		System.out.println(x);
	}
}
