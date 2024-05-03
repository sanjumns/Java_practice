class Typecasting 
{
	void say()
	{
		System.out.println("Converting one type to another");
	}
}
class Classtypecast extends Typecasting
{
	void saying()
	{
		System.out.println("Converting one class object into another class type");
	}
}
class Casting
{
	public static void main(String[] args) 
	{
		Typecasting t=new Classtypecast(); //upcasting
		t.say();
		Classtypecast c=(Classtypecast) t; //downcasting
		c.say();
		c.saying();

		System.out.println("***************************");
	}
}
