class Whatsapp 
{
	void send(int no)
	{
		System.out.println(no);
	}
	void send(String s)
	{
		System.out.println(s);
	}
	void send(int no, String s)
	{
		System.out.println(no+" "+s);
	}
	void send(String s, int no)
	{
		System.out.println(s+" "+no);
	}
	public static void main(String[] args) 
	{
		Whatsapp w= new Whatsapp();
		w.send(45866);
		w.send("hello");
		w.send(4586, "hello");
		w.send("hello",4586);

		System.out.println("*******************************");
	}
}
