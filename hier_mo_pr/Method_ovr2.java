class Bottled_9 
{
	void feature()
	{
		System.out.println("Only bottles");
	}
}
class Bottled_10 extends Bottled_9
{
	void feature()
	{
		System.out.println("Now you can travel world");
	}
}
class Method_ovr2
{
	public static void main(String[] args) 
	{
		Bottled_10 a=new Bottled_10();
		a.feature();
		System.out.println("***********************");
	}
}
