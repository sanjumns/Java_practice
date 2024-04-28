class Trap 
{
	static void area(double a, double b, double h)
	{
		final double half=0.5;
		double res=half*(a+b)*h;
		System.out.println(res);
	}
}
class Trapezoid
{

	public static void main(String[] args) 
	{
		Trap.area(8.3,5,5.1);
	}
}
