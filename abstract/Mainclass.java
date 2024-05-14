abstract class Demo 
{
	abstract void cool();
	abstract void fo();
}
class Sample extends Demo
{
	void cool()
	{
		System.out.println("Apple Juice");
	}
	void fo()
	{
		System.out.println("Mango Juice");
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.cool();
		s.fo();

		System.out.println("************************");
	}
}
