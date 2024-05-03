class Youtube_v14 
{
	void home()
	{
		System.out.println("Long videos");
	}
}
class Youtube_v15 extends Youtube_v14
{
	void home()
	{
		super.home();
		System.out.println("Short videos introduced");
	}
}
class Youtube
{
	public static void main(String[] args) 
	{
		Youtube_v15 y=new Youtube_v15();
		y.home();

		System.out.println("***********************");
	}
}
