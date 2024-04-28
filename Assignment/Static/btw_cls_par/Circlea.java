class Circ 
{
	static void area(double r)
	{
		final double pi=3.142;
		double res=pi*r*r;
		System.out.println(res);
	}
}
class Circlea
{

	public static void main(String[] args) 
	{
		Circ.area(5.3);
	}
}
