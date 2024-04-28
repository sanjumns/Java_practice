class Ellipse 
{
	double area(double a, double b)
	{
		final double pi=3.142;
		double res=pi*a*b;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(new Ellipse().area(35.2,85.78));
	}
}
