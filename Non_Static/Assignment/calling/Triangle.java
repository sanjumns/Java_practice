class Triangle 
{
	void area()
	{
		final double half=0.5;
		double b=3.5;
		double h=2.4;
		double res=half*b*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
	new Triangle().area();
	}
}
