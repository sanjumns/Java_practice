class Date1 
{
	String a="01/01/2024";
}
class Date2 extends Date1
{
	String b="01/02/2024";
}
class Date3 extends Date2

{
	String c="01/03/2024";
	void disp()
	{
		System.out.println(a+" "+b+" "+c);
	}
}
class Date4 extends Date1
{
	String d="01/04/2024";
	void disp()
	{
		System.out.println(a+" "+d);
	}
}
class Dates
{

	public static void main(String[] args) 
	{
		Date3 d3=new Date3();
		d3.disp();
		Date4 d4=new Date4();
		d4.disp();
		System.out.println("Main Ends here");
	}
}
