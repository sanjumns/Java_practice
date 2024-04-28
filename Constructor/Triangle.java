class Triangle 
{
	static double half=0.5;
	Triangle(double b, double h)
	{
		double res=half*b*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Triangle s=new Triangle(5.3,6.5);
	}
}
