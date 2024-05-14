class Ex_short
{
	public static void main(String[] args) 
	{
		short[] a={1000,3000,5000,8000,4000,11000};
		print_a_f(a);
		print_a_b(a);
		System.out.println("***********************");
	}
	static void print_a_f(short[] x)
	{
		System.out.println("***********************");
		for (int i=0;i<x.length ;i++ )
		{
			System.out.println(x[i]);
		}
	}
	static void print_a_b(short[] x)
	{
		System.out.println("***********************");
		for (int i=x.length-1;i>=0 ;i-- )
		{
			System.out.println(x[i]);
		}
	}
}
