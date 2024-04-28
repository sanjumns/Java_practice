class Book
{
	void givebook()
	{
		System.out.println("Take book");
	}
}
class Library
{

	public static void main(String[] args) 
	{
		Book b=new Book();
		Customer.order(b);
	}
}
class Customer
{
	static void order(Book r)
	{
		r.givebook();
	}
	

}
