class Circle 
{
	final double pi=3.142;
	double result;
	Circle(double r)
	{
		double res=pi*r*r;
		result=res;
		
	}
	public static void main(String[] args) 
	{
		Circle c=new Circle(6.5);
		System.out.println(c.result);
	}
}
