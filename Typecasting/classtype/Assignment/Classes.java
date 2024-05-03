class Class1
{
	void say()
	{
		System.out.println("I'm printing class1");
	}
}
class Class2 extends Class1
{
	void saying()
	{
		System.out.println("I'm printing class2");
	}
}
class Classes
{
	public static void main(String[] args) 
	{
		Class1 c=new Class2(); //upcasting
		c.say();
		Class2 d=(Class2) c; //downcasting
		d.say();
		d.saying();

		System.out.println("***************************");
	}
}
