class Circle
{
	static void area(int r)
	{
		final double pi=3.142;
		double result=pi*r*r;
		System.out.println("        ");
		System.out.println("Area of circle with radius "+r);
		System.out.println(" = "+result);
		System.out.println("        ");


	}
	public static void main(String[] args)
	{
		area(5);
		area(18);
		area(25);
	}
}