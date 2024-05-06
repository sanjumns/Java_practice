class Kart 
{
	void prod()
	{
		System.out.println("Some products");
	}
}
class Electronics extends Kart
{
	void prod()
	{
		System.out.println("Electronics showing");
	}
}
class Grocery extends Kart
{
	void prod()
	{
		System.out.println("Groceries showing");
	}
}
class Mobiles extends Kart
{
	void prod()
	{
		System.out.println("Mobiles showing");
	}
}
class Stimulator
{
	static void stim(Kart k)
	{
		k.prod();
	}
}
class Flipkart
{
	public static void main(String[] args) 
	{
		Electronics e=new Electronics();
		Grocery g=new Grocery();
		Mobiles m=new Mobiles();
		Stimulator.stim(e);
		Stimulator.stim(g);
		Stimulator.stim(m);
		System.out.println("***********************");
	}
}
