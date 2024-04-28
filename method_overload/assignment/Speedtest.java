class Speedtest 
{
	static void test(String loc)
	{
		System.out.println(loc);
	}
	static void test(int server)
	{
		System.out.println(server);
	}
	static void test(String loc, int server)
	{
		System.out.println(loc+" "+server);
	}
	static void test(int server, String loc)
	{
		System.out.println(server+" "+loc);
	}
	public static void main(String[] args) 
	{
		test("Bengalore");
		test(11235);
		test("Bengalore",11235);
		test(11235, "Bengalore");
	}
}
