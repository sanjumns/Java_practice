class Play
{
	void play_music()
	{
		System.out.println("Playing music");
	}
}
class Apple_music
{

	public static void main(String[] args) 
	{
		Play p=new Play();
		Customer.order(p);
	}
}
class Customer
{
	static void order(Play r)
	{
		r.play_music();
	}
	

}
