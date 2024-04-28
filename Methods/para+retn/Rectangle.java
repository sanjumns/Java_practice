class Rectangle 
{
	static double area(double w, double h)
	{
		double res=w*h;
		return res;
	}
	public static void main(String[] args) 
	{
		double x=area(30.5, 40.8);
		System.out.println(x);
	}
}
