class Library 
{
	static void borrow(String name)
	{
		System.out.println(name);
	}
	static void borrow(int isbn)
	{
		System.out.println(isbn);
	}
	static void borrow(String name, int isbn)
	{
		System.out.println(name+" "+isbn);
	}
	static void borrow(int isbn, String name)
	{
		System.out.println(isbn+" "+name);
	}
	public static void main(String[] args) 
	{
		borrow("Kudiyara Koosu");
		borrow(121213);
		borrow("Kudiyara Koosu",121213);
		borrow(121213,"Kudiyara Koosu");
		System.out.println("**********Main ends here*********");
	}
}
