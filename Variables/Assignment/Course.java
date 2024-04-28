class Course 
{
	static String un_name;
	String c_name;
	int ex_cost;
	public static void main(String[] args) 
	{
		un_name="VTU";
		Course c=new Course();
		c.c_name="EVE";
		c.ex_cost=2500;
		System.out.println(un_name+" "+c.c_name+" "+c.ex_cost);
	}
}
