class Ell 
{
	static void area(double a, double b)
	{
		final double pi=3.142;
		double res=pi*a*b;
		System.out.println(res);
	}
}
class Ellipse
{

	public static void main(String[] args) 
	{
		Ell.area(5.3,8.3);
	}
}
