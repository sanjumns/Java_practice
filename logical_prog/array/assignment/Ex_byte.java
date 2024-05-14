class Ex_byte
{
	public static void main(String[] args) 
	{
		byte[] a={1,3,5,8,4,11};
		print_a_f(a);
		print_a_b(a);
		System.out.println("***********************");
	}
	static void print_a_f(byte[] x)
	{
		System.out.println("***********************");
		for (int i=0;i<x.length ;i++ )
		{
			System.out.println(x[i]);
		}
	}
	static void print_a_b(byte[] x)
	{
		System.out.println("***********************");
		for (int i=x.length-1;i>=0 ;i-- )
		{
			System.out.println(x[i]);
		}
	}
}
