class Sample1 
{
	int a=10;
}
class Demo1 extends Sample1
{
	void disp()
	{
		System.out.println("Hi");
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		//upcasting
		Sample1 s1=new Demo1();
		System.out.println(s1.a);
		//downcasting
		Demo1 d=(Demo1) s1;
		System.out.println(d.a);
		d.disp();
	}
}
