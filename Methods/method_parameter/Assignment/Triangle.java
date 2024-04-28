class Triangle
{
	static void area(double b, double h)
	{
		final double half=0.5;
		double area=half*b*h;
		System.out.println(area);
	}
	public static void main(String[] args)
	{
		area(15, 11.2);
	}
}