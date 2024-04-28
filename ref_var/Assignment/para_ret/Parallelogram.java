class Parallelogram 
{
	double area(double b, double h)
	{
		double res=b*h;
		return res;
	}
	public static void main(String[] args) 
	{
		Parallelogram x=new Parallelogram();
		System.out.println(x.area(5.3,4.5));
	}
}
