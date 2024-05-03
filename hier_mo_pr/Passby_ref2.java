class Petrol 
{
	void wantpetrol()
	{
		System.out.println("Fill Petrol");
	}
}
class Passby_ref2
{
	public static void main(String[] args)
	{
		Petrol p=new Petrol();
		Celerio.needpetrol(p);
	}
}
class Celerio
{
	static void needpetrol(Petrol p)
	{
		p.wantpetrol();
	}
}