class Number1 
{
	int a=35;
}
class Number2 extends Number1
{
	int b=55;
	void disp()
	{
		System.out.println(a+b);
	}
}
class Numbers
{

	public static void main(String[] args) 
	{
		Number2 n=new Number2();
		n.disp();

		System.out.println("Successful");
	}
}
