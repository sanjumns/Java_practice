class Number1 
{
	int a=10;
}
class Number2 extends Number1
{
	int b=20;
	void disp()
	{
		System.out.println(a+b);
	}
}
class Number3 extends Number1
{
	int c=30;
	void disp()
	{
		System.out.println(a+c);
	}
}
class Numbers
{
	public static void main(String[] args) 
	{
		Number2 n=new Number2();
		n.disp();
		Number3 n3=new Number3();
		n3.disp();
		System.out.println("Mains Ends here");
	}
}
