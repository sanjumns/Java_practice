class Sector
{
	static double area(double r, double t)
	{
		final double half=0.5;
		double res=half*r*r*t;
		return res;
	}
	public static void main(String[] args) 
	{
		double x=area(10,45);
		System.out.println(x);
	}
}
