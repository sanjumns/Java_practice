class Aunty
{
	void givejob()
	{
		System.out.println("Take Job");
	}
}
class Uncle 
{
	public static void main(String[] args) 
	{
		Aunty a=new Aunty();
		Girl.needjob(a);
		Boy.needjob(a);
		System.out.println("Main Ends Here");
	}
}
class Girl
{
	static void needjob(Aunty r)
	{
		System.out.println("Girl--->");
		r.givejob();
		System.out.println("                              ");
	}
}
class Boy
{
	static void needjob(Aunty r1)
	{
		System.out.println("Boy--->");
		r1.givejob();
		System.out.println("                              ");
	}
}