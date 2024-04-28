class Para 
{
	static double area(double b, double h)
	{
		double res=b*h;
		return res;
	}
}
class Parallelogram
{

	public static void main(String[] args) 
	{
		double x=Para.area(5.98,4.36);
		System.out.println(x);
	}
}
