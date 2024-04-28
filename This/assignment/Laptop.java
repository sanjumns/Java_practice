class Laptop 
{
	String brand;
	int cost;
	String model;
	Laptop(String brand, int cost, String model)
	{
		this.brand=brand;
		this.cost=cost;
		this.model=model;
	}
	public static void main(String[] args) 
	{
		Laptop l=new Laptop("Dell",55000,"Inspiron14");
		System.out.println(l.brand);
		System.out.println(l.cost);
		System.out.println(l.model);
	}
}
