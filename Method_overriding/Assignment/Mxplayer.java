class Mxplayer_v25 
{
	void home()
	{
		System.out.println("Only offline videos available");
	}
}
class Mxplayer_v26 extends Mxplayer_v25
{
	void home()
	{
		super.home();
		System.out.println("Streans service introduced");
	}
}
class Mxplayer
{
	public static void main(String[] args) 
	{
		Mxplayer_v26 v26=new Mxplayer_v26();
		v26.home();

		System.out.println("***********************");
	}
}
