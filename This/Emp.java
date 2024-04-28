class Emp 
{
	String empname;
	int empid;
	double empsal;
	Emp(String empname, int empid, double empsal)
	{
		this.empname=empname;
		this.empid=empid;
		this.empsal=empsal;
	}
	public static void main(String[] args) 
	{
		Emp e1=new Emp("Sanjay",236,250000);
		System.out.println(e1.empname);
		System.out.println(e1.empid);
		System.out.println(e1.empsal);
	}
}
