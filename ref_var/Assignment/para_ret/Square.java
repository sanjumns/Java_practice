class Square 
{
	double area(double a)
	{
		double res=a*a;
		return res;
	}
	public static void main(String[] args) 
	{
		Square x=new Square();
		System.out.println(x.area(5.3));
	}
}
