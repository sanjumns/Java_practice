class State1 
{
	String a="Karnataka";
}
class State2 extends State1
{
	String b="Tamil Nadu";
	void disp()
	{
		System.out.println(a+" "+b);
	}
}
class State3 extends State1
{
	String c="Andra Pradesh";
	void disp()
	{
		System.out.println(a+" "+c);
	}
}
class States
{
	public static void main(String[] args) 
	{
		State2 s=new State2();
		s.disp();
		State3 s3=new State3();
		s3.disp();
		System.out.println("Main Ends");
	}
}
