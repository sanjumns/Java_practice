class Sample10
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4};
		print_arr_F(arr);
		print_arr_B(arr);
	}
	static void print_arr_F(int[] a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
	}
	static void print_arr_B(int[] b)
	{
		for (int i=b.length-1;i>=0 ;i-- )
		{
			System.out.println(b[i]);

		}
	}
}
