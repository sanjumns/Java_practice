class Ventusky 
{
	void features()
	{
		System.out.println("Free to use");
	}
}
class Ventusky_v2 extends Ventusky
{
	void features()
	{
		System.out.println("Paid version and some features are free");
	}
}
class Mainclass2
{

	public static void main(String[] args) 
	{
		Ventusky_v2 v2= new Ventusky_v2();
		System.out.println("************************");
		v2.features();
		System.out.println("************************");
	}
}
