class Instagram_v45 
{
	void dashboard()
	{
		System.out.println("Photos and Videos");
	}
}
class Instagram_v46 extends Instagram_v45
{
	void dashboard()
	{
		super.dashboard();
		System.out.println("Reels introduced");
	}
}
class Instagram
{
	public static void main(String[] args) 
	{
		Instagram_v46 i=new Instagram_v46();
		i.dashboard();

		System.out.println("***********************");
	}
}
