class Sector 
{
	double area(double r, double t)
	{
		final double half=0.5;
		double res=half*r*t;
		return res;
	}
	public static void main(String[] args) 
	{
		Sector x=new Sector();
		System.out.println(x.area(1.3,7.3));
	}
}
