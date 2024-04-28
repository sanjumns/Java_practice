class Student 
{
	static void admit(String name)
	{
		System.out.println(name);
	}
	static void admit(double per)
	{
		System.out.println(per);
	}
	static void admit(String name, double per)
	{
		System.out.println(name+" "+per);
	}
	static void admit(double per, String name)
	{
		System.out.println(per+" "+name);
	}
	public static void main(String[] args) 
	{
		admit("Bharath");
		admit(78.56);
		admit("Bharath",78.56);
		admit(78.56,"Bharath");
		System.out.println("********Main Ends here********");
	}
}
