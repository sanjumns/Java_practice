abstract class Demo1 
{
	abstract void cool1();
	abstract void fo1();
}
abstract class Sample1 extends Demo1
{
	// abstract void cool1();
	// abstract void fo1();
	void cool1()
	{
		System.out.println("Apple Juice");
	}
}
class Tester extends Sample1
{
	//void cool1()
	//abstract void fo1();

	void fo1()
	{
		System.out.println("Mango Juice");
	}
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		Tester t=new Tester();
		t.cool1();
		t.fo1();

		System.out.println("**************************");
	}
}
