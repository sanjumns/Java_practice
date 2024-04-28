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
		Circle x=new Circle();
		System.out.println(x.area(7.3));
	}
}
