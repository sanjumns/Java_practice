class Telegram 
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
		send("Hello");
		send(9568456);
		send("Hello",9568456);
		send(9568456, "Hello");
	}
}
