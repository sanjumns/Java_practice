class Rectangle
{
	void area(double w, double b)
	{
		double res=w*b;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Rectangle x=new Rectangle();
		x.area(7.3,6.8);
	}
}
