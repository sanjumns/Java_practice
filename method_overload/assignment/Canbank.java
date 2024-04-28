class Canbank 
{
	static void txn(String name)
	{
		System.out.println(name);
	}
	static void txn(int no)
	{
		System.out.println(no);
	}
	static void txn(String name, int no)
	{
		System.out.println(name+" "+no);
	}
	static void txn(int no, String name)
	{
		System.out.println(no+" "+name);
	}
	public static void main(String[] args) 
	{
		txn("IRCTC");
		txn(523145);
		txn("irctc",523445);
		txn(52354, "irctc");
	}
}
