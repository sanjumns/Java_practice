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
		System.out.println(a+" "+b+" "+c);
	}
}
class Number4 extends Number1
{
	int d=40;
	void disp()
	{
		System.out.println(a+" "+d);
	}

}
class Numbers
{
	public static void main(String[] args) 
	{
		Number3 n3=new Number3();
		n3.disp();
		Number4 n4=new Number4();
		n4.disp();
		System.out.println("Main Ends here");
	}
}
