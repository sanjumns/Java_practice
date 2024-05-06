class Payapp 
{
	void pay()
	{
		System.out.println("Sending money");
	}
}
class UPI extends Payapp
{
	void pay()
	{
		System.out.println("Sending through UPI");
	}
}
class NEFT extends Payapp
{
	void pay()
	{
		System.out.println("Sending through NEFT");
	}
}
class IMPS extends Payapp
{
	void pay()
	{
		System.out.println("Sending through IMPS");
	}
}
class Stimulator
{
	static void stim(Payapp p)
	{
		p.pay();
	}
}
class Canarabank
{
	public static void main(String[] args) 
	{
		UPI u=new UPI();
		NEFT n=new NEFT();
		IMPS i=new IMPS();
		Stimulator.stim(u);
		Stimulator.stim(n);
		Stimulator.stim(i);
		System.out.println("***********************");
	}
}
