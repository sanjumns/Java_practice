interface Maps
{
	void map();
} 
class P_map implements Maps
{
	public void map()
	{
		System.out.println("Plain map displayed");
	}
}
class Sat_map implements Maps
{
	public void map()
	{
		System.out.println("Satellite map displayed");
	}
}
class Ter_map implements Maps
{
	public void map()
	{
		System.out.println("Terrain map displayed");
	}
}
class Stimulator
{
	static void stim(Maps m)
	{
		m.map();
	}
}
class Google_Map
{
	public static void main(String[] args) 
	{
		P_map p=new P_map();
		Sat_map s=new Sat_map();
		Ter_map t=new Ter_map();
		Stimulator.stim(p);
		Stimulator.stim(s);
		Stimulator.stim(t);

		System.out.println("*********************");
	}
}
