class Sect 
{
	static void area(double r, double t)
	{
		final double half=0.5;
		double res=half*r*r*t;
		System.out.println(res);
	}
}
class Sector
{

	public static void main(String[] args) 
	{
		Sect.area(5.3,55);
	}
}
