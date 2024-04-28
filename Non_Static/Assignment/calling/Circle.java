class Circle 
{
	void area()
	{
		final double pi=3.142;
		double r=75.36;
		double res=pi*r*r;
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		new Circle().area();
	}
}
