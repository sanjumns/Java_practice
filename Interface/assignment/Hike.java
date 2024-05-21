interface CommApp
{
	void send();
} 
class Doc implements CommApp
{
	public void send()
	{
		System.out.println("Sending document");
	}
}
class Image implements CommApp
{
	public void send()
	{
		System.out.println("Sending image");
	}
}
class Music implements CommApp
{
	public void send()
	{
		System.out.println("Sending Music");
	}
}

class Stimulator
{
	static void stim(CommApp c)
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
		System.out.println("*******************");
	}
}
