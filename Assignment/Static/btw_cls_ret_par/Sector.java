class Sect 
{
	static double area(double r, double t)
	{
		final double half=0.5;
		double res=half*r*r*t;
		return res;
	}
}
class Sector
{

	public static void main(String[] args) 
	{
		System.out.println(Sect.area(5.2,45));
	}
}
