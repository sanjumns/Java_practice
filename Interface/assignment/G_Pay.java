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
class Account implements Payapp
{
	public void pay()
	{
		System.out.println("Paying through Account");
	}
}
class Numbers implements Payapp
{
	public void pay()
	{
		System.out.println("Paying through Numbers");
	}
}

class Stimulator
{
	static void stim(Payapp p)
	{
		p.pay();
	}
}
class G_Pay
{
	public static void main(String[] args) 
	{
		UPI u=new UPI();
		Account n=new Account();
		Numbers i=new Numbers();
		Stimulator.stim(u);
		Stimulator.stim(n);
		Stimulator.stim(i);
		System.out.println("Hello World!");
	}
}
