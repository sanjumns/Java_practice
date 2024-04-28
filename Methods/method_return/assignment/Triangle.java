class Triangle 
{
	static double b=30.52;
	static double h=11.30;

	static double area()
	{ 
		final double half=0.5;
		double result=half*b*h;
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println("The area of triangle having base="+b+" height="+h+" is "+area());
	}
}
