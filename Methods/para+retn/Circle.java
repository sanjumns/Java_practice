class Circle
{
	static double area(double r)
	{
		final double pi=3.142;
		double res=pi*r*r;
		return res;
	}
	public static void main(String[] args) 
	{
		double x=area(5.8);
		System.out.println(x);
	}
}
