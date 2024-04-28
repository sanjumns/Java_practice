class Kannada 
{
	String a="Kannada";
}
class Hindi extends Kannada
{
	String b="Hindi";
}
class Telugu extends Hindi
{
	String c="Telugu";
	void disp()
	{
		System.out.println(a+" "+b+" "+c);
	}
}
class English extends Kannada
{
	String d="English";
	void disp()
	{
		System.out.println(a+" "+d);
	}
}
class Movies
{
	public static void main(String[] args) 
	{
		Telugu t=new Telugu();
		t.disp();
		English e=new English();
		e.disp();
		System.out.println("Main Ends Here");
	}
}
