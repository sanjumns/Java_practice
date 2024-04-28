class Sector 
{
	static void area(double r, double t)
	{
		final double half=0.5;
		double area=half*r*r*t;
		System.out.println("Area of sector having radius "+r+" and angle "+t+" is "+area);
	}
	public static void main(String[] args) 
	{
		area(5.5,60);
	}
}
