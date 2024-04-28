class Circ 
{
	static double area(double r)
	{
		final double pi=3.142;
		double res=pi*r*r;
		return res;
	}
}
class Circle
{

	public static void main(String[] args) 
	{
		System.out.println(Circ.area(4.5));
	}
}
