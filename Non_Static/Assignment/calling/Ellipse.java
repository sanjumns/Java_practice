class Ellipse 
{
	void area()
	{
		final double pi=3.142;
		double a=78.2;
		double b=96.3;
		double res=pi*a*b;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new Ellipse().area();
	}
}
