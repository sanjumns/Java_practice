import java.util.Arrays;
class Ex_int
{
	public static void main(String[] args) 
	{
		int[] a={10987276,30182562,50172653,88292726,47263736,11082329};
		Arrays.sort(a);
		print_a_f(a);
		print_a_b(a);
		System.out.println("***********************");
	}
	static void print_a_f(int[] x)
	{
		System.out.println("***********************");
		for (int i=0;i<x.length ;i++ )
		{
			System.out.println(x[i]);
		}
	}
	static void print_a_b(int[] x)
	{
		System.out.println("***********************");
		for (int i=x.length-1;i>=0 ;i-- )
		{
			System.out.println(x[i]);
		}
	}
}
