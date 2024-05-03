class Dell
{
	void say()
	{
		System.out.println("I have Laptop");
	}
}
class Laptop extends Dell
{
	void saying()
	{
		System.out.println("I owned by Dell");
	}
}
class Lapcom
{
	public static void main(String[] args) 
	{
		Dell d=new Laptop(); //upcasting
		d.say();
		Laptop l=(Laptop) d; //downcasting
		l.say();
		l.saying();


		System.out.println("***************************");
	}
}
