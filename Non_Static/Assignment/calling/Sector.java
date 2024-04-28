class Sector 
{
	void area()
	{
		final double half=0.5;
		double r=56.3;
		double t=45;
		double res=half*r*r*t;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new Sector().area();
	}
}
