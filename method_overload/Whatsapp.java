class Whatsapp 
{
	static void send(String msg)
	{
		System.out.println(msg);
	}
	static void send(int no)
	{
		System.out.println(no);
	}
	static void send(String msg, int no)
	{
		System.out.println(msg+" "+no);
	}
	static void send(int no, String msg)
	{
		System.out.println(no+" "+msg);
	}


	public static void main(String[] args) 
	{
		send("Hi");
		send(973850478);
		send("Hi",973850478);
		send(97385047,"Hi");
	}
}
