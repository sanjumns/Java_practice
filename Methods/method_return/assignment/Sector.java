class Sector 
{
	static double area()
	{
		final double pi=3.142;
		double r=3.5;
		double t=60;
		return pi*r*t;
	}
	public static void main(String[] args) 
	{
		
		System.out.println(area());
	}
}
