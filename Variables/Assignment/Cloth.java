class Cloths
{
	String color;
	int cost;
	String size;
}
class Cloth
{

	public static void main(String[] args) 
	{ 
		Cloths c=new Cloths();
		c.color="Green";
		c.cost=550;
		c.size="XL";
		System.out.println(c.color+" "+c.cost+" "+c.size);
	}
}
