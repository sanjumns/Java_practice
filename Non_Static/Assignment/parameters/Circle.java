class Circle 
{
	double area(double r)
	{
		final double pi=3.142;
		double res=pi*r*r;
		return res;
	}

	public static void main(String[] args) 
	{
		System.out.println(new Circle().area(85.45));
	}
}
