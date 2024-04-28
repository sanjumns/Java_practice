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
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class Movies
{

	public static void main(String[] args) 
	{
		Telugu t=new Telugu();
		t.disp();
		System.out.println("Main Ends");
	}
}
