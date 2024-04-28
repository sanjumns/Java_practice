class Phonepe 
{
	static void pay(String name)
	{
		System.out.println(name);
	}
	static void pay(int no)
	{
		System.out.println(no);
	}
	static void pay(String name, int no)
	{
		System.out.println(name+" "+no);
	}
	static void pay(int no, String name)
	{
		System.out.println(no+" "+name);
	}
	public static void main(String[] args) 
	{
		pay("Yashwanth");
		pay(97385047);
		pay("Yashwanth",97385047);
		pay(97385047,"Yashwanth");
		System.out.println("**********Main ends here*********");
	}
}
