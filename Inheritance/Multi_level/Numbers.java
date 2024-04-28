class Number1 
{
	int a=10;
}
class Number2 extends Number1
{
	int b=20;
}
class Number3 extends Number2
{
	int c=30;
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
class Numbers
{
	public static void main(String[] args) 
	{
		Number3 n=new Number3();
		n.disp();

	}
}
