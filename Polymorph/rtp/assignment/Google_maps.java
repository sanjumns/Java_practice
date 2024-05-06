class Maps 
{
	void map()
	{
		System.out.println("Google map");
	}
}
class Plain_maps extends Maps
{
	void map()
	{
		System.out.println("Plain Map showing");
	}
}
class Sat_maps extends Maps
{
	void map()
	{
		System.out.println("Satellite Map showing");
	}
}
class Terrain_maps extends Maps
{
	void map()
	{
		System.out.println("Terrain Map showing");
	}
}
class Stimulator
{
	static void stim(Maps m)
	{
		m.map();
	}
}
class Google_maps
{
	public static void main(String[] args) 
	{
		Plain_maps p=new Plain_maps();
		Sat_maps s=new Sat_maps();
		Terrain_maps t=new Terrain_maps();
		Stimulator.stim(p);
		Stimulator.stim(s);
		Stimulator.stim(t);


		System.out.println("*************************");
	}
}
