class Ellips 
{
	double area(double a, double b)
	{
		final double pi=3.142;
		double res=pi*a*b;
		return res;
	}
	public static void main(String[] args) 
	{
		Ellips x=new Ellips();
		System.out.println(x.area(1.3,7.3));
	}
}
