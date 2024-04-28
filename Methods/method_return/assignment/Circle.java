class Circle 
{
	static double area()
	{
		final double pi=3.142;
		double r=5;
		double result=pi*r*r;
		return result;
	}

	public static void main(String[] args) 
	{
		System.out.println(area());
	}
}
