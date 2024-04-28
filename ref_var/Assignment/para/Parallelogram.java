class Parallelogram
{
	void area(double b, double h)
	{
		double res=b*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Parallelogram x=new Parallelogram();
		x.area(7.3,6.8);
	}
}
