class Trapezoid 
{
	void area(double a, double b, double h)
	{
		final double half=0.5;
		double res=half*(a+b)*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Trapezoid x=new Trapezoid();
		x.area(1.3,7.3,5.3);
	}
}
