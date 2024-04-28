class Ventusky 
{
	static void map(String loc)
	{
		System.out.println(loc);
	}
	static void map(int temp)
	{
		System.out.println(temp);
	}
	static void map(String loc, int temp)
	{
		System.out.println(loc+" "+temp);
	}
	static void map(int temp, String loc)
	{
		System.out.println(temp+" "+loc);
	}
	public static void main(String[] args) 
	{
		map("Davanagere");
		map(35);
		map("Davanagere",35);
		map(35, "Davanagere");
	}
}
