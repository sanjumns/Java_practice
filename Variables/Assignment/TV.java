class TV
{
	static String brand;
	int cost;
	String type;

	public static void main(String[] args) 
	{
		brand="Sony Bravia";
		TV t=new TV();
		t.cost=55000;
		t.type="LED";

		System.out.println(brand+" "+t.cost+" "+t.type);
	}
}
