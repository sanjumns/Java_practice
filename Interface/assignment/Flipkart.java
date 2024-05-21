interface Cart
{
	void prod();
} 
class Electronics implements Cart
{
	public void prod()
	{
		System.out.println("Electronics showing");
	}
}
class Grocery implements Cart
{
	public void prod()
	{
		System.out.println("Groceries are displayer");
	}
}
class Mobile implements Cart
{
	public void prod()
	{
		System.out.println("Mobiles are displayed");
	}
}

class Stimulator 
{
	static void ansim(Cart p)
	{
		p.prod();
	}
}
class Flipkart
{
	public static void main(String[] args) 
	{
		Electronics e=new Electronics();
		Grocery g=new Grocery();
		Mobile m=new Mobile();
		Stimulator.ansim(e);
		Stimulator.ansim(g);
		Stimulator.ansim(m);
		System.out.println("**********************");
	}
}
