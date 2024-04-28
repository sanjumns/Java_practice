class TV 
{
	String brand;
	int cost;
	String type;
	TV(String brand, int cost, String type)
	{
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}
	public static void main(String[] args) 
	{
		TV t=new TV("Sony Bravia",55000,"LED");
		System.out.println(t.brand);
		System.out.println(t.cost);
		System.out.println(t.type);
	}
}
