class Cal 
{
	int y=30;
}
class Col extends Cal
{
	void add()
	{
		System.out.println("I'm Sub");
	}
}
class Mainclass4
{
	public static void main(String[] args) 
	{
		//upcast
		Cal c=new Col();
		System.out.println(c.y);
		//downcast
		Col c1=(Col) c;
		System.out.println(c.y);
		c1.add();
	}
}
