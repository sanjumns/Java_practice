class Sector 
{
	double area(double r, double t)
	{
		final double half=0.5;
		double res=half*r*r*t;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(new Sector().area(36.58,50));
	}
}
