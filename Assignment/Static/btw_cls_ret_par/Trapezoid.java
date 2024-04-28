class Trap 
{
	static double area(double a, double b, double h)
	{
		final double half=0.5;
		double res=half*(a+b)*h;
		return res;
	}
}
class Trapezoid
{

	public static void main(String[] args) 
	{
		System.out.println(Trap.area(5.2,4.7,3.3));
	}
}
