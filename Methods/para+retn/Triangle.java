class Triangle 
{
	static double area(double b, double h)
	{
		final double half=0.5;
		double res=half*b*h;
		return res;
	}
	public static void main(String[] args) 
	{
		double x=area(30.5,11.3);
		System.out.println(x);
	}
}
