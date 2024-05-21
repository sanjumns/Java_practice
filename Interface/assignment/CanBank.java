interface Payapp
{
	void pay();
}
class UPI implements Payapp
{
	public void pay()
	{
		System.out.println("Paying through UPI");
	}
}
class NEFT implements Payapp
{
	public void pay()
	{
		System.out.println("Paying through NEFT");
	}
}
class IMPS implements Payapp
{
	public void pay()
	{
		System.out.println("Paying through IMPS");
	}
}

class Stimulator
{
	static void stim(Payapp p)
	{
		p.pay();
	}
}
class CanBank
{
	public static void main(String[] args) 
	{
		UPI u=new UPI();
		NEFT n=new NEFT();
		IMPS i=new IMPS();
		Stimulator.stim(u);
		Stimulator.stim(n);
		Stimulator.stim(i);
		System.out.println("Hello World!");
	}
}
