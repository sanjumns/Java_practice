class Google 
{
	static void search(String term)
	{
		System.out.println(term);
	}
	static void search(int no)
	{
		System.out.println(no);
	}
	static void search(String term, int no)
	{
		System.out.println(term+" "+no);
	}
	static void search(int no, String term)
	{
		System.out.println(no+" "+term);
	}
	public static void main(String[] args) 
	{
		search("Tourist places");
		search(523145);
		search("Tourist places",523445);
		search(52354, "Tourist places");
	}
}
