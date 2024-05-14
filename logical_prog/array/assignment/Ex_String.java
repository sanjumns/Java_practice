class Ex_String
{
	public static void main(String[] args) 
	{
		String[] a={"Rashmi","Sushmitha","Akshatha"};
		print_a_f(a);
		print_a_b(a);
		System.out.println("***********************");
	}
	static void print_a_f(String[] x)
	{
		System.out.println("***********************");
		for (int i=0;i<x.length ;i++ )
		{
			System.out.println(x[i]);
		}
	}
	static void print_a_b(String[] x)
	{
		System.out.println("***********************");
		for (int i=x.length-1;i>=0 ;i-- )
		{
			System.out.println(x[i]);
		}
	}
}
