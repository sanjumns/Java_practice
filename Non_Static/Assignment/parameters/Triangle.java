class Triangle 
{
	double area(double b, double h)
	{
		final double half=0.5;
		double res=half*b*h;
		return res;
	}
	public static void main(String[] args) 
	{
	System.out.println(new Triangle().area(3.5,2.4));
	}
}
