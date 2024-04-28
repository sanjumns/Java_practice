class Trap 
{
	static void area()
	{
		final double half=0.5;
		double a=5.5;
		double b=6.5;
		double h=3.2;
		double res=half*(a+b)*h;
		System.out.println(res);
	}
}
class Trapezoid
{

	public static void main(String[] args) 
	{
		Trap.area();
	}
}
