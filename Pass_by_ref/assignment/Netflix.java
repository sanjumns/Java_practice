class Play
{
	void play_movie()
	{
		System.out.println("Playing movie");
	}
}
class Netflix
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
		r.play_movie();
	}
	

}
