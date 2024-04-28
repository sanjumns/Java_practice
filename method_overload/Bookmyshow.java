class Bookmyshow 
{
	static void book(String movie)
	{
		System.out.println(movie);
	}
	static void book(int tkt)
	{
		System.out.println(tkt);
	}
	static void book(String movie, int tkt)
	{
		System.out.println(movie+" "+tkt);
	}
	static void book(int tkt, String movie)
	{
		System.out.println(tkt+" "+movie);
	}


	public static void main(String[] args) 
	{
		book("Terminator");
		book(101);
		book("Terminator",101);
		book(101,"Terminator");
	}
}
