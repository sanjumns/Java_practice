interface Ventusky 
{
	void map();
}
class Sat implements Ventusky
{
	public void map()
	{
		System.out.println("Satellite map shown");
	}
}
class Temp implements Ventusky
{
	public void map()
	{
		System.out.println("Temperature data shown");
	}
}
class wind implements Ventusky
{
	public void map()
	{
		System.out.println("Wind data shown");
	}
}

class Stimulator
{
	static void ansim(Ventusky a)
	{
		a.map();
	}
}

class Mainclass2
{
	public static void main(String[] args) 
	{
		Sat d=new Sat();
		Temp c=new Temp();
		wind s=new wind();
		Stimulator.ansim(d);
		Stimulator.ansim(c);
		Stimulator.ansim(s);

		System.out.println("*************************");
	}
}
