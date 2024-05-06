class Maps 
{
	void map()
	{
		System.out.println("Weather map");
	}
}
class Temp extends Maps
{
	void map()
	{
		System.out.println("Temperature data showing");
	}
}
class Precip extends Maps
{
	void map()
	{
		System.out.println("Precipitation data showing");
	}
}
class Wind extends Maps
{
	void map()
	{
		System.out.println("Wind data showing");
	}
}
class Stimulator
{
	static void stim(Maps m)
	{
		m.map();
	}
}
class Ventusky
{
	public static void main(String[] args) 
	{
		Temp t=new Temp();
		Precip p=new Precip();
		Wind w=new Wind();
		Stimulator.stim(t);
		Stimulator.stim(p);
		Stimulator.stim(w);


		System.out.println("*************************");
	}
}
