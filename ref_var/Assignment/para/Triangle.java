class Triangle 
{
	void area(double b, double h)
	{
		final double half=0.5;
		double res=half*b*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Triangle x=new Triangle();
		x.area(1.3,7.3);
	}
}
