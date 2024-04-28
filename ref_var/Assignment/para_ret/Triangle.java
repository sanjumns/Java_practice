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
		Triangle x=new Triangle();
		System.out.println(x.area(5.3,5.5));
	}
}
