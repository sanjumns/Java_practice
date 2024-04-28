class Counter
{
	void givefood()
	{
		System.out.println("Take food");
	}
}
class Hotel
{

	public static void main(String[] args) 
	{
		Counter c=new Counter();
		Customer.order(c);
	}
}
class Customer
{
	static void order(Counter r)
	{
		r.givefood();
	}
	

}
