class Rectangle 
{
	double area(double w, double b)
	{
		double res=w*b;
		return res;
	}
	public static void main(String[] args) 
	{
		Rectangle x=new Rectangle();
		System.out.println(x.area(5.3,4.5));
	}
}
