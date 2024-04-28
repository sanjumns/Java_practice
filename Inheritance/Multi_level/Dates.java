class Date1 
{
	String a="23/06/1990";
}
class Date2 extends Date1
{
	String b="23/04/2024";
	void disp()
	{
		System.out.println("Date of birth-"+a +" and current date is "+b);
	}
}
class Date3 extends Date2
{
	String c="23/06/2024";
	

}
class Dates
{
	public static void main(String[] args) 
	{
		Date3 d=new Date3();
		d.disp();
		System.out.println("Successful");
		System.out.println(d.a);
	System.out.println(d.b);
	System.out.println(d.c);
	}
}
