class Car 
{
	int cost;
	String mod;
	String type;
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.cost=660000;
		c.mod="Suzuki Celerio";
		c.type="Petrol";
		System.out.println(c.cost+" "+c.mod+" "+c.type);
	}
}
