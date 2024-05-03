class Flud_v9 
{
	void home()
	{
		System.out.println("No ads displayed");
	}
}
class Flud_v10 extends Flud_v9
{
	void home()
	{
		super.home();
		System.out.println("Ads are displayed now");
	}
}
class Flud
{
	public static void main(String[] args) 
	{
		System.out.println("************************");
		Flud_v10 v10=new Flud_v10();
		v10.home();
		System.out.println("************************");
	}
}
