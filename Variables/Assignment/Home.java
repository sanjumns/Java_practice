class Hom 
{
	static String name;
	String color;
	int cost;
}
class Home
{
	public static void main(String[] args) 
	{
		Hom.name="Janani";
		Hom h=new Hom();
		h.color="Yellow";
		h.cost=7500000;
		System.out.println(Hom.name+" "+h.color+" "+h.cost);
	}
}
