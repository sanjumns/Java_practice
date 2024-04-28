class Trapezoidd
{
	double area(double a, double b, double h)
	{
		final double half=0.5;
		double res=half*(a+b)*h;
		return res;
	}
		
	public static void main(String[] args) 
	{
		System.out.println(new Trapezoidd().area(85.3,17.23,88.3));	
	}
}
