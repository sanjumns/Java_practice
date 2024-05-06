class Commapp 
{
	void send()
	{
		System.out.println("Sending file");
	}
}
class Doc extends Commapp
{
	void send()
	{
		System.out.println("Sending Document");
	}
}
class Image extends Commapp
{
	void send()
	{
		System.out.println("Sending Image");
	}
}
class Music extends Commapp
{
	void send()
	{
		System.out.println("Sending Music");
	}
}
class Stimulator
{
	static void stim(Commapp c)
	{
		c.send();
	}
}
class Hike
{
	public static void main(String[] args) 
	{
		Doc d=new Doc();
		Image i=new Image();
		Music m=new Music();
		Stimulator.stim(d);
		Stimulator.stim(i);
		Stimulator.stim(m);
		System.out.println("***********************");
	}
}
