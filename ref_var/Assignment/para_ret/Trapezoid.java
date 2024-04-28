class Trapezoid 
{
	double area(double a, double b, double h)
	{
		final double half=0.5;
		double res=half*(a+b)*h;
		return res;
	}
	public static void main(String[] args) 
	{
		Trapezoid x=new Trapezoid();
		System.out.println(x.area(5.3,4.5,7.3));
	}
}
