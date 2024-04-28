class Laptop1
{
static String brand;
String model;
int cost;
	public static void main(String[] args) 
	{
		brand="Dell";
		Car1 c=new Car1();
		c.model="Inspiron 14";
		c.cost=55000;
		System.out.println(brand+" "+c.model+" "+c.cost);
	}
}
