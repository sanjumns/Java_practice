class Ell 
{
	static double area(double a, double b)
	{
		final double pi=3.142;
		double res=pi*a*b;
		return res;
	}
}
class Ellipse
{
	public static void main(String[] args) 
	{
		System.out.println(Ell.area(4.5,7.2));
	}
}
